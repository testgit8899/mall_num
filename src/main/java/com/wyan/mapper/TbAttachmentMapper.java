package com.wyan.mapper;

import com.wyan.pojo.TbAttachment;
import com.wyan.pojo.TbAttachmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAttachmentMapper {
    long countByExample(TbAttachmentExample example);

    int deleteByExample(TbAttachmentExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(TbAttachment record);

    int insertSelective(TbAttachment record);

    List<TbAttachment> selectByExample(TbAttachmentExample example);

    TbAttachment selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") TbAttachment record, @Param("example") TbAttachmentExample example);

    int updateByExample(@Param("record") TbAttachment record, @Param("example") TbAttachmentExample example);

    int updateByPrimaryKeySelective(TbAttachment record);

    int updateByPrimaryKey(TbAttachment record);
}