package com.wyan.mapper;

import com.wyan.pojo.TbCustomRecyle;
import com.wyan.pojo.TbCustomRecyleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbCustomRecyleMapper {
    long countByExample(TbCustomRecyleExample example);

    int deleteByExample(TbCustomRecyleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCustomRecyle record);

    int insertSelective(TbCustomRecyle record);

    List<TbCustomRecyle> selectByExample(TbCustomRecyleExample example);

    TbCustomRecyle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCustomRecyle record, @Param("example") TbCustomRecyleExample example);

    int updateByExample(@Param("record") TbCustomRecyle record, @Param("example") TbCustomRecyleExample example);

    int updateByPrimaryKeySelective(TbCustomRecyle record);

    int updateByPrimaryKey(TbCustomRecyle record);

    Long findCustomOrder(Map map);

    Long findRecyleOrder(Map map);
}