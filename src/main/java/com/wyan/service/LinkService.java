package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbLink;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface LinkService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbLink> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbLink link);


	/**
	 * 修改
	 */
	public void update(TbLink link);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbLink findOne(Integer linkid);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] linkids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbLink link, int pageNum, int pageSize);
	
}
