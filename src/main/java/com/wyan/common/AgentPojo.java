package com.wyan.common;

import com.wyan.pojo.TbAdmin;

/**
 * @Auther: wyan
 * @Date: 2020-05-31 11:27
 * @Description:
 */
public class AgentPojo  extends TbAdmin{

    private String parentName;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
