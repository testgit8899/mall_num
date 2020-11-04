package com.wyan.mapper;

import com.wyan.pojo.TbAttachmentIndex;
import com.wyan.pojo.TbAttachmentIndexExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAttachmentIndexMapper {
    long countByExample(TbAttachmentIndexExample example);

    int deleteByExample(TbAttachmentIndexExample example);

    int insert(TbAttachmentIndex record);

    int insertSelective(TbAttachmentIndex record);

    List<TbAttachmentIndex> selectByExample(TbAttachmentIndexExample example);

    int updateByExampleSelective(@Param("record") TbAttachmentIndex record, @Param("example") TbAttachmentIndexExample example);

    int updateByExample(@Param("record") TbAttachmentIndex record, @Param("example") TbAttachmentIndexExample example);
}