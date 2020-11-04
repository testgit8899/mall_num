package com.wyan.common;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-05-19 15:17
 * @Description:
 */
public class PageResult  extends  Result{

    private List data;
    private Long count;

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
