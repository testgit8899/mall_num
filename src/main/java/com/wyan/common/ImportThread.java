package com.wyan.common;

import com.wyan.mapper.TbHaomaMapper;
import com.wyan.pojo.TbHaoma;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Auther: wyan
 * @Date: 2020-05-13 14:01
 * @Description:
 */
public class ImportThread implements Runnable {


    public ImportThread() {
    }

    private List<TbHaoma> list;
    private CountDownLatch begin;
    private CountDownLatch end;

    private TbHaomaMapper haomaMapper;

    /**
     * 方法名: ImportThread
     * 方法描述: 创建个构造函数初始化 list,和其他用到的参数
     * @throws
     */
    public ImportThread(List<TbHaoma> list, CountDownLatch begin, CountDownLatch end,TbHaomaMapper haomaMapper) {
        this.list = list;
        this.begin = begin;
        this.end = end;
        this.haomaMapper=haomaMapper;
    }

    @Override
    public void run() {
        try {
            //执行完让线程直接进入等待
            haomaMapper.saveBatch(list);
            begin.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //这里要主要了，当一个线程执行完 了计数要减一不然这个线程会被一直挂起
            //这个方法就是直接把计数器减一的
            end.countDown();
        }
    }

}