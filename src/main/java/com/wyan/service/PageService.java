package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbPage;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PageService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbPage> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbPage page);


	/**
	 * 修改
	 */
	public void update(TbPage page);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbPage findOne(Integer catid);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] catids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbPage page, int pageNum, int pageSize);
	
}
