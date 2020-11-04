package com.wyan.mapper;

import com.wyan.pojo.TbArticle;
import com.wyan.pojo.TbArticleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbArticleMapper {
    long countByExample(TbArticleExample example);

    int deleteByExample(TbArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbArticle record);

    int insertSelective(TbArticle record);

    List<TbArticle> selectByExample(TbArticleExample example);

    TbArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExample(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByPrimaryKeySelective(TbArticle record);

    int updateByPrimaryKey(TbArticle record);
}