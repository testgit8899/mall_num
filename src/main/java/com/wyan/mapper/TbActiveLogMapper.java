package com.wyan.mapper;

import com.wyan.pojo.TbActiveLog;
import com.wyan.pojo.TbActiveLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbActiveLogMapper {
    long countByExample(TbActiveLogExample example);

    int deleteByExample(TbActiveLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbActiveLog record);

    int insertSelective(TbActiveLog record);

    List<TbActiveLog> selectByExample(TbActiveLogExample example);

    TbActiveLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbActiveLog record, @Param("example") TbActiveLogExample example);

    int updateByExample(@Param("record") TbActiveLog record, @Param("example") TbActiveLogExample example);

    int updateByPrimaryKeySelective(TbActiveLog record);

    int updateByPrimaryKey(TbActiveLog record);
}