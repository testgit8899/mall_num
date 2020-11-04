package com.wyan.mapper;

import com.wyan.pojo.TbLink;
import com.wyan.pojo.TbLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLinkMapper {
    long countByExample(TbLinkExample example);

    int deleteByExample(TbLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLink record);

    int insertSelective(TbLink record);

    List<TbLink> selectByExample(TbLinkExample example);

    TbLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLink record, @Param("example") TbLinkExample example);

    int updateByExample(@Param("record") TbLink record, @Param("example") TbLinkExample example);

    int updateByPrimaryKeySelective(TbLink record);

    int updateByPrimaryKey(TbLink record);

    List<TbLink> selectByUserName(String username);
}