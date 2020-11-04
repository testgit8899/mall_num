package com.wyan.mapper;

import com.wyan.pojo.ProfitSet;
import com.wyan.pojo.TbLink;
import com.wyan.pojo.TbLinkExample;
import com.wyan.pojo.WebSet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProfitSetMapper {

    public List<ProfitSet> findAllProfitSet();

    void save(ProfitSet webSet);

    void update(ProfitSet webSet);

    ProfitSet findOneByLevel(Integer level);
}