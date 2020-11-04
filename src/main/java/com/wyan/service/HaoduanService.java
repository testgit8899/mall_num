package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbHaoduan;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface HaoduanService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbHaoduan> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbHaoduan haoduan);


	/**
	 * 修改
	 */
	public void update(TbHaoduan haoduan);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbHaoduan findOne(Integer id);


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
	public PageInfo findPage(TbHaoduan haoduan, int pageNum, int pageSize);
	
}
