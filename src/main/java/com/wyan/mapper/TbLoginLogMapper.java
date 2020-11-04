package com.wyan.mapper;

import com.wyan.pojo.TbLoginLog;
import com.wyan.pojo.TbLoginLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLoginLogMapper {
    long countByExample(TbLoginLogExample example);

    int deleteByExample(TbLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLoginLog record);

    int insertSelective(TbLoginLog record);

    List<TbLoginLog> selectByExample(TbLoginLogExample example);

    TbLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLoginLog record, @Param("example") TbLoginLogExample example);

    int updateByExample(@Param("record") TbLoginLog record, @Param("example") TbLoginLogExample example);

    int updateByPrimaryKeySelective(TbLoginLog record);

    int updateByPrimaryKey(TbLoginLog record);
}