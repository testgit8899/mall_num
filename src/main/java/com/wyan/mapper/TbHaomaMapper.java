package com.wyan.mapper;

import com.wyan.pojo.TbHaoma;
import com.wyan.pojo.TbHaomaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbHaomaMapper {
    long countByExample(TbHaomaExample example);

    int deleteByExample(TbHaomaExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbHaoma record);

    int insertSelective(TbHaoma record);

    List<TbHaoma> selectByExample(TbHaomaExample example);

    TbHaoma selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbHaoma record, @Param("example") TbHaomaExample example);

    int updateByExample(@Param("record") TbHaoma record, @Param("example") TbHaomaExample example);

    int updateByPrimaryKeySelective(TbHaoma record);

    int updateByPrimaryKey(TbHaoma record);

    void saveBatch(List<TbHaoma> list);

    Long totalNum();
}