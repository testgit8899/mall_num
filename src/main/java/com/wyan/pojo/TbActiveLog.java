package com.wyan.pojo;

import java.io.Serializable;

public class TbActiveLog implements Serializable {
    private Long id;

    private String ip;

    private Integer hits;

    private String addTime;

    private String addDay;

    private String addMonth;

    private String addYear;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getAddDay() {
        return addDay;
    }

    public void setAddDay(String addDay) {
        this.addDay = addDay == null ? null : addDay.trim();
    }

    public String getAddMonth() {
        return addMonth;
    }

    public void setAddMonth(String addMonth) {
        this.addMonth = addMonth == null ? null : addMonth.trim();
    }

    public String getAddYear() {
        return addYear;
    }

    public void setAddYear(String addYear) {
        this.addYear = addYear == null ? null : addYear.trim();
    }
}