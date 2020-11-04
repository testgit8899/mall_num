package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbAdminRoleMapper;
import com.wyan.pojo.TbAdminRole;
import com.wyan.pojo.TbAdminRoleExample;
import com.wyan.pojo.TbAdminRoleExample.Criteria;
import com.wyan.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdminRoleServiceImpl implements AdminRoleService {

	@Autowired
	private TbAdminRoleMapper adminRoleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAdminRole> findAll() {
		return adminRoleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbAdminRole> list=    adminRoleMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAdminRole adminRole) {
		adminRoleMapper.insert(adminRole);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbAdminRole adminRole){
		adminRoleMapper.updateByPrimaryKey(adminRole);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbAdminRole findOne(Integer roleid){
		return adminRoleMapper.selectByPrimaryKey(roleid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] roleids) {
		for(Integer roleid:roleids){
			adminRoleMapper.deleteByPrimaryKey(roleid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbAdminRole adminRole, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAdminRoleExample example=new TbAdminRoleExample();
		Criteria criteria = example.createCriteria();
		
		if(adminRole!=null){			
						if(adminRole.getRolename()!=null && adminRole.getRolename().length()>0){
				criteria.andRolenameLike("%"+adminRole.getRolename()+"%");
			}	
		}
		
		List<TbAdminRole> list= adminRoleMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
