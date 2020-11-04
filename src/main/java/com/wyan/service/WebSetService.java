package com.wyan.service;

import com.wyan.mapper.WebSetMapper;
import com.wyan.pojo.WebSet;
import org.apache.ibatis.javassist.tools.web.Webserver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 12:01
 * @Description:
 */
public interface WebSetService {



    public void add(WebSet webSet);

    public void update(WebSet webSet);

    public WebSet findByUserId(String userId);
}
