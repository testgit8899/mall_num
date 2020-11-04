package com.wyan.service.impl;

import com.wyan.mapper.WebSetMapper;
import com.wyan.pojo.WebSet;
import com.wyan.service.WebSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 12:03
 * @Description:
 */
@Service
public class WebSetServiceImpl implements WebSetService {

    @Autowired
    private WebSetMapper setMapper;

    @Override
    public void add(WebSet webSet) {
        setMapper.save(webSet);
    }

    @Override
    public void update(WebSet webSet) {
        setMapper.update(webSet);
    }

    @Override
    public WebSet findByUserId(String userId) {
        return setMapper.findWebSetByUserId(userId);
    }
}
