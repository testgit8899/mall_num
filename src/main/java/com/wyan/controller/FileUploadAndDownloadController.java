package com.wyan.controller;

import com.wyan.common.*;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbHaoma;
import com.wyan.service.AdminService;
import com.wyan.service.HaomaService;
import org.apache.poi.ss.usermodel.Cell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: wyan
 * @Date: 2019/2/13 19:04
 * @Description:
 */
@RestController
@CrossOrigin
@RequestMapping("/file")
public class FileUploadAndDownloadController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(FileUploadAndDownloadController.class);

    @Autowired
    private HaomaService haomaService;

    private String imageServer ="";

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private AdminService adminService;


    @RequestMapping("/uploadImg")
    public Result uploadImg( MultipartFile file){
        //得到上传后的文件路径
        String fileUrl = UploadFile.uploadFile(file);
        //跳转到分类的列表展示数据
        return new Result(true,fileUrl,CommonValue.OK);
    }
    @RequestMapping("/uploadArtic")
    public Map uploadArtic(MultipartFile file){
        //得到上传后的文件路径
        String fileUrl = UploadFile.uploadFile(file);
        Map map = new HashMap();
        map.put("code",CommonValue.OK);
        List urls = new ArrayList();
        urls.add(fileUrl);
        map.put("data",urls);
        //跳转到分类的列表展示数据
        return map;
    }

    @RequestMapping(value = "/uploadFile")
    @ResponseBody
    public Result uploadExcel(MultipartFile file) throws Exception {
        if(null==file||file.getSize()<1){
            return new Result(false,"文件不能为空");
        }
        System.out.println("当前时间为：===="+new Date());
        InputStream is =null;
        try{
            String fileName = file.getOriginalFilename();
            is = new ByteArrayInputStream(file.getBytes());
            //String fileName ="D:\\test.csv";
            //is=new FileInputStream("D:\\test.csv");
            if(fileName.endsWith("csv")){
                //获取每行中的每个列数据
                ArrayList<String[]> properties = ImportUtil.parseCsv(is);
                List<TbHaoma> haomas = parseCsvObject(properties);
                //批量保存号码
                haomaService.saveList(haomas);
                System.out.println("结束时间为：===="+new Date());
            }else{
                List<List<Cell>> list = ImportUtil.getBankListByExcel(is, file.getOriginalFilename());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null!=is){
                is.close();
            }
        }
        return new Result(true,"导入数据成功");
    }
    private List<TbHaoma> parseCsvObject(List<String []> list) {
        List<TbHaoma> haomas = new ArrayList<>();
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        TbAdmin admin = adminService.findByName(username);
        for(int i=1;i< list.size();i++){
            String [] arr = list.get(i);
            //每一行的 数组创建一个对象
            TbHaoma haoma = new TbHaoma();
            String cityName = arr[8];
            haoma.setCityName(cityName);
            haoma.setId(idWorker.nextId()+"");
            haoma.setStatus(CommonValue.NORMAL);
            String cellNum = arr[2];
            haoma.setCellNum(cellNum);

            haoma.setSeller(admin.getRealname());
            String wangluo = arr[9];
            haoma.setWangluo(wangluo);
            String price = arr[3];
            haoma.setPrice(Integer.parseInt(price));
            String salePrice = arr[4];
            haoma.setSalePrice(Integer.parseInt(salePrice));
            haoma.setAgentPrice(0);
            String huafei = arr[5];
            haoma.setHuafei(Integer.parseInt(huafei));
            String dixiao = arr[11];
            haoma.setDixiao(Integer.parseInt(dixiao));
            String infomation = arr[14];
            haoma.setInfomation(infomation);
            String serviceNum = arr[13];
            haoma.setServiceNum(serviceNum);
            haoma.setAddtime(new Date());
            haoma.setRecommonded(CommonValue.UNRECOMONDED);
            String share  = arr[1];
            if(share.equals("是")){
                haoma.setShare(1);
            }else{
                haoma.setShare(0);
            }
            //靓号类型
            String type = arr[6];
            haoma.setType(type);
            haoma.setProvinceName(arr[7]);
            haoma.setSellerBrand(arr[10]);
            haoma.setAgentId(admin.getUserid());
            haoma.setHaoduan((haoma.getCellNum()+"").substring(0,3));
            haoma.setXfYear(Integer.parseInt(arr[12]));
            System.out.println(haoma);
            haomas.add(haoma);
        }
        return haomas;
    }

    private void parseExcelObject(
            List<List<Cell>> list) {
        //创建号码list集合用于批量保存
        List<TbHaoma> numList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            List<Cell> lo = list.get(i);
            TbHaoma haoma = new TbHaoma();
            System.out.println(i + "行号====");
            try {
                String dateStr = lo.get(22).getStringCellValue();
                if (dateStr.contains(".")) {
                    dateStr = dateStr.replace(".", "-");
                }
                if (dateStr.contains("/")) {
                    dateStr = dateStr.replace("/", "-");
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                if (null != lo.get(20)) {
                    DecimalFormat df = new DecimalFormat("0");
                    String p = df.format(lo.get(20).getNumericCellValue());
                }

            }catch (Exception e){

            }
        }
        haomaService.saveList(numList);

    }
}