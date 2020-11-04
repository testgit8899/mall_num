package com.wyan.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbHaoma implements Serializable {
    private String id;

    private Integer status;

    private String cellNum;

    private String cityName;

    private String seller;

    private String wangluo;

    private Integer price;

    private Integer salePrice;

    private Integer agentPrice;

    private Integer huafei;

    private Integer dixiao;

    private String infomation;

    private String serviceNum;

    private Date addtime;

    private Integer recommonded;

    private Date selltime;

    private Integer share;

    private String type;

    private String provinceName;

    private String sellerBrand;

    private Integer agentId;

    private String haoduan;

    private Integer xfYear;

    private String category;

    private String netNum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    public String getWangluo() {
        return wangluo;
    }

    public void setWangluo(String wangluo) {
        this.wangluo = wangluo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getAgentPrice() {
        return agentPrice;
    }

    public void setAgentPrice(Integer agentPrice) {
        this.agentPrice = agentPrice;
    }

    public Integer getHuafei() {
        return huafei;
    }

    public void setHuafei(Integer huafei) {
        this.huafei = huafei;
    }

    public Integer getDixiao() {
        return dixiao;
    }

    public void setDixiao(Integer dixiao) {
        this.dixiao = dixiao;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
    }

    public String getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(String serviceNum) {
        this.serviceNum = serviceNum;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getRecommonded() {
        return recommonded;
    }

    public void setRecommonded(Integer recommonded) {
        this.recommonded = recommonded;
    }

    public Date getSelltime() {
        return selltime;
    }

    public void setSelltime(Date selltime) {
        this.selltime = selltime;
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getSellerBrand() {
        return sellerBrand;
    }

    public void setSellerBrand(String sellerBrand) {
        this.sellerBrand = sellerBrand == null ? null : sellerBrand.trim();
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getHaoduan() {
        return haoduan;
    }

    public void setHaoduan(String haoduan) {
        this.haoduan = haoduan;
    }

    public Integer getXfYear() {
        return xfYear;
    }

    public void setXfYear(Integer xfYear) {
        this.xfYear = xfYear;
    }

    public String getNetNum() {
        return netNum;
    }

    public void setNetNum(String netNum) {
        this.netNum = netNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TbHaoma{" +
                "id=" + id +
                ", status=" + status +
                ", cellNum=" + cellNum +
                ", cityName='" + cityName + '\'' +
                ", seller='" + seller + '\'' +
                ", wangluo='" + wangluo + '\'' +
                ", price=" + price +
                ", salePrice=" + salePrice +
                ", agentPrice=" + agentPrice +
                ", huafei=" + huafei +
                ", dixiao=" + dixiao +
                ", infomation='" + infomation + '\'' +
                ", serviceNum=" + serviceNum +
                ", addtime=" + addtime +
                ", recommonded=" + recommonded +
                ", selltime=" + selltime +
                ", share=" + share +
                ", type='" + type + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", sellerBrand='" + sellerBrand + '\'' +
                ", agentId=" + agentId +
                ", haoduan='" + haoduan + '\'' +
                ", xfYear=" + xfYear +
                '}';
    }
}