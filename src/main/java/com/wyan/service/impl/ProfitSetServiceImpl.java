package com.wyan.service.impl;

import com.wyan.mapper.ProfitSetMapper;
import com.wyan.mapper.WebSetMapper;
import com.wyan.pojo.ProfitSet;
import com.wyan.pojo.WebSet;
import com.wyan.service.ProfitService;
import com.wyan.service.WebSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 12:03
 * @Description:
 */
@Service
public class ProfitSetServiceImpl implements ProfitService {

    @Autowired
    private ProfitSetMapper setMapper;

    @Override
    public ProfitSet findOneByLevel(Integer level) {

        return setMapper.findOneByLevel(level);
    }
    @Override
    public void add(ProfitSet webSet) {
        setMapper.save(webSet);
    }

    @Override
    public void update(ProfitSet webSet) {
        setMapper.update(webSet);
    }

    @Override
    public List<ProfitSet> findList() {
        return setMapper.findAllProfitSet();
    }


}
