package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbAdminRole;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AdminRoleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbAdminRole> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbAdminRole admin_role);


	/**
	 * 修改
	 */
	public void update(TbAdminRole admin_role);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbAdminRole findOne(Integer roleid);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] roleids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbAdminRole admin_role, int pageNum, int pageSize);
	
}
