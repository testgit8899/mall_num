package com.wyan.mapper;

import com.wyan.pojo.TbAd;
import com.wyan.pojo.TbAdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAdMapper {
    long countByExample(TbAdExample example);

    int deleteByExample(TbAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAd record);

    int insertSelective(TbAd record);

    List<TbAd> selectByExampleWithBLOBs(TbAdExample example);

    List<TbAd> selectByExample(TbAdExample example);

    TbAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByExample(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByPrimaryKeySelective(TbAd record);

    int updateByPrimaryKeyWithBLOBs(TbAd record);

    int updateByPrimaryKey(TbAd record);
}