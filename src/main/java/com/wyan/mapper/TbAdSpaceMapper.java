package com.wyan.mapper;

import com.wyan.pojo.TbAdSpace;
import com.wyan.pojo.TbAdSpaceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAdSpaceMapper {
    long countByExample(TbAdSpaceExample example);

    int deleteByExample(TbAdSpaceExample example);

    int deleteByPrimaryKey(Integer spaceid);

    int insert(TbAdSpace record);

    int insertSelective(TbAdSpace record);

    List<TbAdSpace> selectByExample(TbAdSpaceExample example);

    TbAdSpace selectByPrimaryKey(Integer spaceid);

    int updateByExampleSelective(@Param("record") TbAdSpace record, @Param("example") TbAdSpaceExample example);

    int updateByExample(@Param("record") TbAdSpace record, @Param("example") TbAdSpaceExample example);

    int updateByPrimaryKeySelective(TbAdSpace record);

    int updateByPrimaryKey(TbAdSpace record);
}