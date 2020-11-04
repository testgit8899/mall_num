package com.wyan.task;

/**
 * @Auther: wyan
 * @Date: 2020-06-23 00:29
 * @Description:
 */
import com.wyan.common.DateUtil;
import com.wyan.pojo.CountData;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbCashLog;
import com.wyan.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-06-06 09:45
 * @Description:
 */
public class CountDataTask {

    @Autowired
    private AdminService adminService;
    
    @Autowired
    private CashLogService cashLogService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomRecyleService customRecyleService;

    @Autowired
    private HaomaService haomaService;

    @Autowired
    private CountDataService countDataService;
    //每天插入数据存储
    //@Scheduled(cron = "0/20 * * * * ?")
    public void saveCountData(){

        System.out.println("开始插入数据"+new Date());
        List<TbAdmin> allAdmin = adminService.findAll();
        for (TbAdmin admin : allAdmin) {
            Integer userid = admin.getUserid();
            /*//说明是管理员
            if(userid==1){
                //先删除数据 再插入数据
                countDataService.deleteByUserId(userid);*/
            CountData cd = createCountData();
            countDataService.save(cd);
            System.out.println("插入数据结束"+new Date());
            //}
        }
    }


    private CountData createCountData() {
        List<TbAdmin> allSeller = adminService.findAllSeller();
        CountData cd = new CountData();
        //昨日体现数据
        Long costMoney = cashLogService.findCostMoney();
        cd.setCostMoney(costMoney.intValue());
        //昨日号码订单
        Long haomaOrder = orderService.findHaomaOrder();
        cd.setHaomaOrder(haomaOrder.intValue());
        //获取本月体现金额
        Long monthCostMoney = cashLogService.findMonthCostMoney();
        cd.setMonthCostMoney(monthCostMoney.intValue());
        //本月收入
        Long monthReviceMoney = orderService.findMonthReviceMoney();
        cd.setMonthReviceMoney(monthReviceMoney.intValue());

        cd.setNewOrder(haomaOrder.intValue());
        //获取昨日的收入
        Long reviceMoney = orderService.findReviceMoney();
        cd.setReviceMoney(reviceMoney.intValue());
        //获取合作商的数量
        if(allSeller!=null){
            cd.setSupplierNum(allSeller.size());
        }else{
            cd.setSupplierNum(0);
        }
        //统计总体现金额
        Long totalCostMoney = cashLogService.findTotalCostMoney();
        cd.setTotalCostMoney(totalCostMoney.intValue());

        //号码总订单
        Long totalOrder = orderService.totalNum();
        cd.setTotalOrder(totalOrder.intValue());
        //号码总数量
        Long totalNum = haomaService.totalNum();
        cd.setTotalNum(totalNum.intValue());
        //总收入
        Long totalReviceMoney = orderService.totalReviceMoney();
        cd.setTotalReviceMoney(totalReviceMoney.intValue());
        cd.setUserid(1);
        //年度总提现支出
        Long yearCostMoney = cashLogService.yearCostMoney();
        cd.setYearCostMoney(yearCostMoney.intValue());
        //年度总收入
        Long yearReceiveMoney = orderService.yearReceiveMoney();
        cd.setYearReviceMoney(yearReceiveMoney.intValue());
        cd.setAvilableMoney(totalReviceMoney.intValue()-totalCostMoney.intValue());
        //保存统计的年月日三种日期时间
        cd.setCountYear(DateUtil.formatDateToStr(new Date(),"yyyy"));
        cd.setCountMonth(DateUtil.formatDateToStr(new Date(),"yyyy-MM"));
        cd.setCountDay(DateUtil.formatDateToStr(new Date(),"yyyy-MM-dd"));
        return cd;

    }
}
