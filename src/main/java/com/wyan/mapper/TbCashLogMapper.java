package com.wyan.mapper;

import com.wyan.pojo.TbCashLog;
import com.wyan.pojo.TbCashLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbCashLogMapper {
    long countByExample(TbCashLogExample example);

    int deleteByExample(TbCashLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCashLog record);

    int insertSelective(TbCashLog record);

    List<TbCashLog> selectByExample(TbCashLogExample example);

    TbCashLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCashLog record, @Param("example") TbCashLogExample example);

    int updateByExample(@Param("record") TbCashLog record, @Param("example") TbCashLogExample example);

    int updateByPrimaryKeySelective(TbCashLog record);

    int updateByPrimaryKey(TbCashLog record);

    Long findCostMoney(Map map);

    void updateState(TbCashLog cashLog);

    void updateImg(TbCashLog cashLog);
}