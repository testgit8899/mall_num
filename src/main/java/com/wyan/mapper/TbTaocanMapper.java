package com.wyan.mapper;

import com.wyan.pojo.TbTaocan;
import com.wyan.pojo.TbTaocanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTaocanMapper {
    long countByExample(TbTaocanExample example);

    int deleteByExample(TbTaocanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTaocan record);

    int insertSelective(TbTaocan record);

    List<TbTaocan> selectByExampleWithBLOBs(TbTaocanExample example);

    List<TbTaocan> selectByExample(TbTaocanExample example);

    TbTaocan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTaocan record, @Param("example") TbTaocanExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTaocan record, @Param("example") TbTaocanExample example);

    int updateByExample(@Param("record") TbTaocan record, @Param("example") TbTaocanExample example);

    int updateByPrimaryKeySelective(TbTaocan record);

    int updateByPrimaryKeyWithBLOBs(TbTaocan record);

    int updateByPrimaryKey(TbTaocan record);
}