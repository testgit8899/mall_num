package com.wyan.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbCashLog implements Serializable {
    private Long id;

    private String agentName;

    private String agentShop;

    private Integer cashMoney;

    private String applyTime;

    private String agreeTime;

    private Integer state;

    private Integer type;

    private Long userId;
    private String name;
    private String account;
    private Integer roleType;
    private String cashImg;

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentShop() {
        return agentShop;
    }

    public void setAgentShop(String agentShop) {
        this.agentShop = agentShop == null ? null : agentShop.trim();
    }

    public Integer getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(Integer cashMoney) {
        this.cashMoney = cashMoney;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getAgreeTime() {
        return agreeTime;
    }

    public void setAgreeTime(String agreeTime) {
        this.agreeTime = agreeTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCashImg() {
        return cashImg;
    }

    public void setCashImg(String cashImg) {
        this.cashImg = cashImg;
    }
}