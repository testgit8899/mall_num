package com.wyan.mapper;

import com.wyan.pojo.TbH400;
import com.wyan.pojo.TbH400Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbH400Mapper {
    long countByExample(TbH400Example example);

    int deleteByExample(TbH400Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbH400 record);

    int insertSelective(TbH400 record);

    List<TbH400> selectByExampleWithBLOBs(TbH400Example example);

    List<TbH400> selectByExample(TbH400Example example);

    TbH400 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbH400 record, @Param("example") TbH400Example example);

    int updateByExampleWithBLOBs(@Param("record") TbH400 record, @Param("example") TbH400Example example);

    int updateByExample(@Param("record") TbH400 record, @Param("example") TbH400Example example);

    int updateByPrimaryKeySelective(TbH400 record);

    int updateByPrimaryKeyWithBLOBs(TbH400 record);

    int updateByPrimaryKey(TbH400 record);
}