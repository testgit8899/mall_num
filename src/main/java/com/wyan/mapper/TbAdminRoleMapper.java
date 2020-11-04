package com.wyan.mapper;

import com.wyan.pojo.TbAdminRole;
import com.wyan.pojo.TbAdminRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAdminRoleMapper {
    long countByExample(TbAdminRoleExample example);

    int deleteByExample(TbAdminRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(TbAdminRole record);

    int insertSelective(TbAdminRole record);

    List<TbAdminRole> selectByExampleWithBLOBs(TbAdminRoleExample example);

    List<TbAdminRole> selectByExample(TbAdminRoleExample example);

    TbAdminRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") TbAdminRole record, @Param("example") TbAdminRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAdminRole record, @Param("example") TbAdminRoleExample example);

    int updateByExample(@Param("record") TbAdminRole record, @Param("example") TbAdminRoleExample example);

    int updateByPrimaryKeySelective(TbAdminRole record);

    int updateByPrimaryKeyWithBLOBs(TbAdminRole record);

    int updateByPrimaryKey(TbAdminRole record);
}