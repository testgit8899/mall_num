package com.wyan.pojo;

import java.io.Serializable;

public class TbCategoryWithBLOBs extends TbCategory implements Serializable {
    private String arrchildid;

    private String description;

    private String setting;

    private String additional;

    private static final long serialVersionUID = 1L;

    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid == null ? null : arrchildid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting == null ? null : setting.trim();
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional == null ? null : additional.trim();
    }
}