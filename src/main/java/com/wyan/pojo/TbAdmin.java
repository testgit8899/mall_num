package com.wyan.pojo;

import java.io.Serializable;

public class TbAdmin implements Serializable {

    private Integer userid;

    private String username;

    private String password;

    private Integer roleid;

    private String lastloginip;

    private String addTime;

    private String phonenum;

    private String realname;

    private String lang;

    private String useraccount;

    private String linkqq;

    private String address;

    private String city;

    private String province;

    private Integer level;

    private String domainAddress;

    private String qrcode;

    private Integer cashtype;

    private String cashcount;

    private String cashname;

    private Integer state;

    private Integer parentId;

    private String parentName;
    private String netNum;

    public String getNetNum() {
        return netNum;
    }

    public void setNetNum(String netNum) {
        this.netNum = netNum;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    private static final long serialVersionUID = 1L;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public String getLinkqq() {
        return linkqq;
    }

    public void setLinkqq(String linkqq) {
        this.linkqq = linkqq == null ? null : linkqq.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDomainAddress() {
        return domainAddress;
    }

    public void setDomainAddress(String domainAddress) {
        this.domainAddress = domainAddress == null ? null : domainAddress.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public Integer getCashtype() {
        return cashtype;
    }

    public void setCashtype(Integer cashtype) {
        this.cashtype = cashtype;
    }

    public String getCashcount() {
        return cashcount;
    }

    public void setCashcount(String cashcount) {
        this.cashcount = cashcount == null ? null : cashcount.trim();
    }

    public String getCashname() {
        return cashname;
    }

    public void setCashname(String cashname) {
        this.cashname = cashname == null ? null : cashname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}