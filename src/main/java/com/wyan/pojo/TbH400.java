package com.wyan.pojo;

import java.io.Serializable;

public class TbH400 implements Serializable {
    private Integer id;

    private Integer listorder;

    private Integer yunyingshang;

    private Long haoma;

    private Integer cityid;

    private Integer yuexiaofei;

    private Integer taocan;

    private Integer status;

    private Integer tuijian;

    private Integer youxiaoqi;

    private Integer inputtime;

    private Integer updatetime;

    private Integer userid;

    private String username;

    private Integer selltime;

    private String ip;

    private Long hits;

    private String shuoming;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    public Integer getYunyingshang() {
        return yunyingshang;
    }

    public void setYunyingshang(Integer yunyingshang) {
        this.yunyingshang = yunyingshang;
    }

    public Long getHaoma() {
        return haoma;
    }

    public void setHaoma(Long haoma) {
        this.haoma = haoma;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getYuexiaofei() {
        return yuexiaofei;
    }

    public void setYuexiaofei(Integer yuexiaofei) {
        this.yuexiaofei = yuexiaofei;
    }

    public Integer getTaocan() {
        return taocan;
    }

    public void setTaocan(Integer taocan) {
        this.taocan = taocan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTuijian() {
        return tuijian;
    }

    public void setTuijian(Integer tuijian) {
        this.tuijian = tuijian;
    }

    public Integer getYouxiaoqi() {
        return youxiaoqi;
    }

    public void setYouxiaoqi(Integer youxiaoqi) {
        this.youxiaoqi = youxiaoqi;
    }

    public Integer getInputtime() {
        return inputtime;
    }

    public void setInputtime(Integer inputtime) {
        this.inputtime = inputtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
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

    public Integer getSelltime() {
        return selltime;
    }

    public void setSelltime(Integer selltime) {
        this.selltime = selltime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public String getShuoming() {
        return shuoming;
    }

    public void setShuoming(String shuoming) {
        this.shuoming = shuoming == null ? null : shuoming.trim();
    }
}