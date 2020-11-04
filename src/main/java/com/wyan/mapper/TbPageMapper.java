package com.wyan.mapper;

import com.wyan.pojo.TbPage;
import com.wyan.pojo.TbPageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPageMapper {
    long countByExample(TbPageExample example);

    int deleteByExample(TbPageExample example);

    int deleteByPrimaryKey(Integer catid);

    int insert(TbPage record);

    int insertSelective(TbPage record);

    List<TbPage> selectByExampleWithBLOBs(TbPageExample example);

    List<TbPage> selectByExample(TbPageExample example);

    TbPage selectByPrimaryKey(Integer catid);

    int updateByExampleSelective(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByExampleWithBLOBs(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByExample(@Param("record") TbPage record, @Param("example") TbPageExample example);

    int updateByPrimaryKeySelective(TbPage record);

    int updateByPrimaryKeyWithBLOBs(TbPage record);

    int updateByPrimaryKey(TbPage record);
}