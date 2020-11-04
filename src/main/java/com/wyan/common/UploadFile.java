package com.wyan.common;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.BucketInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Auther: wyan
 * @Date: 2020-03-19 20:15
 * @Description:
 */
public class UploadFile {

    private static String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "LTAI4G76BfDzNGswJxMpa6oh";
    private static String accessKeySecret = "eaQE2aWJra6a5dJYJi9Dz24lIuHJvY";
    private static String bucketName = "mall-wyan";
    public static String imgeFileHost = "https://mall-wyan.oss-cn-beijing.aliyuncs.com/";
    public static String uploadFile(MultipartFile file){

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {

            if (ossClient.doesBucketExist(bucketName)) {
                System.out.println("您已经创建Bucket：" + bucketName + "。");
            } else {
                System.out.println("您的Bucket不存在，创建Bucket：" + bucketName + "。");
                ossClient.createBucket(bucketName);
            }
            BucketInfo info = ossClient.getBucketInfo(bucketName);
            //输入流是上传的文件数据流 我们一会改成图片的输入流对象
            InputStream is = new ByteArrayInputStream(file.getBytes());
            //定义上传后文件的名称  11.jpg 22.png
            String fileName = file.getOriginalFilename();
            //获取文件名的后缀
            String ext = fileName.substring(fileName.lastIndexOf("."));
            //使用UUID生成随机字符串作为文件名
            String fileKey = UUID.randomUUID()+ext;
            ossClient.putObject(bucketName, fileKey,is);
            System.out.println("Object：" + fileKey + "存入OSS成功。");
            String fileUrl = imgeFileHost+fileKey;
            System.out.println(fileUrl);
            is.close();
            return fileUrl;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
        return "";
    }
}
