package com.wyan.mapper;

import com.wyan.pojo.ProfitSet;
import com.wyan.pojo.WebSet;

import java.util.List;

public interface WebSetMapper {

    public WebSet findWebSetByUserId(String userId);

    void save(WebSet webSet);

    void update(WebSet webSet);
}