package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbPage404;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface Page404Service {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbPage404> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbPage404 page404);


	/**
	 * 修改
	 */
	public void update(TbPage404 page404);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbPage404 findOne(Integer id);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbPage404 page404, int pageNum, int pageSize);
	
}
