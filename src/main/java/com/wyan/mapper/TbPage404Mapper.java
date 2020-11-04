package com.wyan.mapper;

import com.wyan.pojo.TbPage404;
import com.wyan.pojo.TbPage404Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPage404Mapper {
    long countByExample(TbPage404Example example);

    int deleteByExample(TbPage404Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPage404 record);

    int insertSelective(TbPage404 record);

    List<TbPage404> selectByExample(TbPage404Example example);

    TbPage404 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPage404 record, @Param("example") TbPage404Example example);

    int updateByExample(@Param("record") TbPage404 record, @Param("example") TbPage404Example example);

    int updateByPrimaryKeySelective(TbPage404 record);

    int updateByPrimaryKey(TbPage404 record);
}