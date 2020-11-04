package com.wyan.mapper;

import com.wyan.pojo.TbCategory;
import com.wyan.pojo.TbCategoryExample;
import com.wyan.pojo.TbCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCategoryMapper {
    long countByExample(TbCategoryExample example);

    int deleteByExample(TbCategoryExample example);

    int deleteByPrimaryKey(Integer catid);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    List<TbCategory> selectByExampleWithBLOBs(TbCategoryExample example);

    List<TbCategory> selectByExample(TbCategoryExample example);

    TbCategory selectByPrimaryKey(Integer catid);

    int updateByExampleSelective(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExample(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKeyWithBLOBs(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}