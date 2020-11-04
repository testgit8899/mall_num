package com.wyan.service.impl;

import com.wyan.mapper.CountDataMapper;
import com.wyan.pojo.CountData;
import com.wyan.service.CountDataService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wyan
 * @Date: 2020-06-23 02:07
 * @Description:
 */
@Service
public class CountDataServiceImpl implements CountDataService {

    @Autowired
    private CountDataMapper countDataMapper;

    @Override
    public void save(CountData cd) {
        countDataMapper.save(cd);
    }

    @Override
    public void deleteByUserId(Integer userid) {
        countDataMapper.deleteByUserId(userid);
    }

    @Override
    public CountData findByLoginUser(Integer userid) {
        return countDataMapper.findByLoginUser(userid);
    }
}
