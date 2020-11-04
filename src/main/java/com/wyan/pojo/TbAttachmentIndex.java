package com.wyan.pojo;

import java.io.Serializable;

public class TbAttachmentIndex implements Serializable {
    private String keyid;

    private String aid;

    private static final long serialVersionUID = 1L;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }
}