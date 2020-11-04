package com.wyan.mapper;

import com.wyan.pojo.TbGuhua;
import com.wyan.pojo.TbGuhuaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGuhuaMapper {
    long countByExample(TbGuhuaExample example);

    int deleteByExample(TbGuhuaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGuhua record);

    int insertSelective(TbGuhua record);

    List<TbGuhua> selectByExampleWithBLOBs(TbGuhuaExample example);

    List<TbGuhua> selectByExample(TbGuhuaExample example);

    TbGuhua selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGuhua record, @Param("example") TbGuhuaExample example);

    int updateByExampleWithBLOBs(@Param("record") TbGuhua record, @Param("example") TbGuhuaExample example);

    int updateByExample(@Param("record") TbGuhua record, @Param("example") TbGuhuaExample example);

    int updateByPrimaryKeySelective(TbGuhua record);

    int updateByPrimaryKeyWithBLOBs(TbGuhua record);

    int updateByPrimaryKey(TbGuhua record);
}