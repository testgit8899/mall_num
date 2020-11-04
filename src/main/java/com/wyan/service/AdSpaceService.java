package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbAdSpace;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AdSpaceService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbAdSpace> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbAdSpace ad_space);


	/**
	 * 修改
	 */
	public void update(TbAdSpace ad_space);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbAdSpace findOne(Integer spaceid);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] spaceids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbAdSpace ad_space, int pageNum, int pageSize);
	
}
