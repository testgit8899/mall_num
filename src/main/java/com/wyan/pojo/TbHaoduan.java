package com.wyan.pojo;

import java.io.Serializable;

public class TbHaoduan implements Serializable {
    private Integer id;

    private Integer yunyingshang;

    private Integer haoduan;

    private Integer type;

    private Integer listorder;

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

    public Integer getHaoduan() {
        return haoduan;
    }

    public void setHaoduan(Integer haoduan) {
        this.haoduan = haoduan;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }
}