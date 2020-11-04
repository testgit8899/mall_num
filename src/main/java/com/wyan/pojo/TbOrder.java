package com.wyan.pojo;

import java.io.Serializable;

public class TbOrder implements Serializable {
    private Long orderno;

    private Long haomaid;

    private String haoma;

    private Integer paytype;

    private String addtime;

    private Integer status;

    private String seller;

    private String agent;

    private Integer userid;

    private String username;

    private Integer cartstatus;

    private Integer price;

    private Integer saleprice;

    private String sellerbrand;

    private String wangluo;

    private String updatetime;

    private Integer sellerRoleType;
    private static final long serialVersionUID = 1L;

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public Long getHaomaid() {
        return haomaid;
    }

    public void setHaomaid(Long haomaid) {
        this.haomaid = haomaid;
    }

    public String getHaoma() {
        return haoma;
    }

    public void setHaoma(String haoma) {
        this.haoma = haoma == null ? null : haoma.trim();
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getCartstatus() {
        return cartstatus;
    }

    public void setCartstatus(Integer cartstatus) {
        this.cartstatus = cartstatus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Integer saleprice) {
        this.saleprice = saleprice;
    }

    public String getSellerbrand() {
        return sellerbrand;
    }

    public void setSellerbrand(String sellerbrand) {
        this.sellerbrand = sellerbrand == null ? null : sellerbrand.trim();
    }

    public String getWangluo() {
        return wangluo;
    }

    public void setWangluo(String wangluo) {
        this.wangluo = wangluo == null ? null : wangluo.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSellerRoleType() {
        return sellerRoleType;
    }

    public void setSellerRoleType(Integer sellerRoleType) {
        this.sellerRoleType = sellerRoleType;
    }
}