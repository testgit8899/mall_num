package com.wyan.service;

import com.wyan.pojo.ProfitSet;
import com.wyan.pojo.WebSet;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 15:47
 * @Description:
 */
public interface ProfitService {
    ProfitSet findOneByLevel(Integer level);

    void add(ProfitSet webSet);

    void update(ProfitSet webSet);

    List<ProfitSet> findList();
}
