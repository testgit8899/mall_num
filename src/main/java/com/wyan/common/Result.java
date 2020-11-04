package com.wyan.common;

/**
 * @Auther: wyan
 * @Date: 2020-05-11 23:34
 * @Description:
 */
public class Result {

    private Boolean success;
    private String msg;
    private Integer code;

    public Result() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Result(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Result(Boolean success, String msg, Integer code) {
        this.success = success;
        this.msg = msg;
        this.code = code;
    }
}
