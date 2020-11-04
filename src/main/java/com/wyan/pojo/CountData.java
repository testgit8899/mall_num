package com.wyan.pojo;

/**
 * @Auther: wyan
 * @Date: 2020-06-23 00:25
 * @Description:
 */
public class CountData {


    private Integer id;
    private Integer totalReviceMoney; //总收入
    private Integer yearReviceMoney; //年度总收入
    private Integer monthReviceMoney; //月度总收入
    private Integer totalCostMoney; //总支出
    private Integer yearCostMoney; //年支出
    private Integer monthCostMoney; //月支出
    private Integer userid; //账单用户id
    private Integer newOrder; //新增订单总数
    private Integer haomaOrder; //号码订单
    private Integer reviceMoney; //昨日收入
    private Integer costMoney; //提现支出
    private Integer supplierNum; //卡商数量
    private Integer totalNum; //号码总数
    private Integer totalOrder; //总订单
    private Integer avilableMoney;  //可提现金额
    private String countYear;  //统计的时间 年格式
    private String countMonth; //统计id时间 月格式
    private String countDay;// 统计的时间 天格式

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalReviceMoney() {
        return totalReviceMoney;
    }

    public void setTotalReviceMoney(Integer totalReviceMoney) {
        this.totalReviceMoney = totalReviceMoney;
    }

    public Integer getYearReviceMoney() {
        return yearReviceMoney;
    }

    public void setYearReviceMoney(Integer yearReviceMoney) {
        this.yearReviceMoney = yearReviceMoney;
    }

    public Integer getMonthReviceMoney() {
        return monthReviceMoney;
    }

    public void setMonthReviceMoney(Integer monthReviceMoney) {
        this.monthReviceMoney = monthReviceMoney;
    }

    public Integer getTotalCostMoney() {
        return totalCostMoney;
    }

    public void setTotalCostMoney(Integer totalCostMoney) {
        this.totalCostMoney = totalCostMoney;
    }

    public Integer getYearCostMoney() {
        return yearCostMoney;
    }

    public void setYearCostMoney(Integer yearCostMoney) {
        this.yearCostMoney = yearCostMoney;
    }

    public Integer getMonthCostMoney() {
        return monthCostMoney;
    }

    public void setMonthCostMoney(Integer monthCostMoney) {
        this.monthCostMoney = monthCostMoney;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(Integer newOrder) {
        this.newOrder = newOrder;
    }

    public Integer getHaomaOrder() {
        return haomaOrder;
    }

    public void setHaomaOrder(Integer haomaOrder) {
        this.haomaOrder = haomaOrder;
    }

    public Integer getReviceMoney() {
        return reviceMoney;
    }

    public void setReviceMoney(Integer reviceMoney) {
        this.reviceMoney = reviceMoney;
    }

    public Integer getCostMoney() {
        return costMoney;
    }

    public void setCostMoney(Integer costMoney) {
        this.costMoney = costMoney;
    }

    public Integer getSupplierNum() {
        return supplierNum;
    }

    public void setSupplierNum(Integer supplierNum) {
        this.supplierNum = supplierNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Integer getAvilableMoney() {
        return avilableMoney;
    }

    public void setAvilableMoney(Integer avilableMoney) {
        this.avilableMoney = avilableMoney;
    }

    public String getCountYear() {
        return countYear;
    }

    public void setCountYear(String countYear) {
        this.countYear = countYear;
    }

    public String getCountMonth() {
        return countMonth;
    }

    public void setCountMonth(String countMonth) {
        this.countMonth = countMonth;
    }

    public String getCountDay() {
        return countDay;
    }

    public void setCountDay(String countDay) {
        this.countDay = countDay;
    }
}
