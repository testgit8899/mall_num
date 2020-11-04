package com.wyan.pojo;

import java.io.Serializable;

public class TbCategory implements Serializable {
    private Integer catid;

    private String module;

    private Integer type;

    private Integer modelid;

    private Integer parentid;

    private String arrparentid;

    private Integer child;

    private String catname;

    private String style;

    private String image;

    private String parentdir;

    private String catdir;

    private String url;

    private Integer items;

    private Integer hits;

    private Integer listorder;

    private Integer ismenu;

    private Integer sethtml;

    private String letter;

    private String usableType;

    private Integer commenttypeid;

    private static final long serialVersionUID = 1L;

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid == null ? null : arrparentid.trim();
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname == null ? null : catname.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getParentdir() {
        return parentdir;
    }

    public void setParentdir(String parentdir) {
        this.parentdir = parentdir == null ? null : parentdir.trim();
    }

    public String getCatdir() {
        return catdir;
    }

    public void setCatdir(String catdir) {
        this.catdir = catdir == null ? null : catdir.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    public Integer getSethtml() {
        return sethtml;
    }

    public void setSethtml(Integer sethtml) {
        this.sethtml = sethtml;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter == null ? null : letter.trim();
    }

    public String getUsableType() {
        return usableType;
    }

    public void setUsableType(String usableType) {
        this.usableType = usableType == null ? null : usableType.trim();
    }

    public Integer getCommenttypeid() {
        return commenttypeid;
    }

    public void setCommenttypeid(Integer commenttypeid) {
        this.commenttypeid = commenttypeid;
    }
}