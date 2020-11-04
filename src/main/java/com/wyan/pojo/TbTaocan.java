package com.wyan.pojo;

import java.io.Serializable;

public class TbTaocan implements Serializable {
    private Integer id;

    private Integer yunyingshang;

    private Integer excelId;

    private Integer listorder;

    private String name;

    private Integer inputtime;

    private Integer updatetime;

    private String ip;

    private Integer hits;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYunyingshang() {
        return yunyingshang;
    }

    public void setYunyingshang(Integer yunyingshang) {
        this.yunyingshang = yunyingshang;
    }

    public Integer getExcelId() {
        return excelId;
    }

    public void setExcelId(Integer excelId) {
        this.excelId = excelId;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}