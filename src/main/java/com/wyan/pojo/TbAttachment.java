package com.wyan.pojo;

import java.io.Serializable;

public class TbAttachment implements Serializable {
    private Integer aid;

    private String m;

    private String c;

    private String a;

    private Integer catid;

    private String filename;

    private String filepath;

    private Integer filesize;

    private String fileext;

    private Integer isimage;

    private Integer isthumb;

    private Integer downloads;

    private Integer userid;

    private Integer uploadtime;

    private String uploadip;

    private Integer status;

    private String authcode;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m == null ? null : m.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getFileext() {
        return fileext;
    }

    public void setFileext(String fileext) {
        this.fileext = fileext == null ? null : fileext.trim();
    }

    public Integer getIsimage() {
        return isimage;
    }

    public void setIsimage(Integer isimage) {
        this.isimage = isimage;
    }

    public Integer getIsthumb() {
        return isthumb;
    }

    public void setIsthumb(Integer isthumb) {
        this.isthumb = isthumb;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Integer uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUploadip() {
        return uploadip;
    }

    public void setUploadip(String uploadip) {
        this.uploadip = uploadip == null ? null : uploadip.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode == null ? null : authcode.trim();
    }
}