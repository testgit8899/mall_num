package com.wyan.mapper;

import com.wyan.pojo.TbHaoduan;
import com.wyan.pojo.TbHaoduanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbHaoduanMapper {
    long countByExample(TbHaoduanExample example);

    int deleteByExample(TbHaoduanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHaoduan record);

    int insertSelective(TbHaoduan record);

    List<TbHaoduan> selectByExample(TbHaoduanExample example);

    TbHaoduan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHaoduan record, @Param("example") TbHaoduanExample example);

    int updateByExample(@Param("record") TbHaoduan record, @Param("example") TbHaoduanExample example);

    int updateByPrimaryKeySelective(TbHaoduan record);

    int updateByPrimaryKey(TbHaoduan record);
}