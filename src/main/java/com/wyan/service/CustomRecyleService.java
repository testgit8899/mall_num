package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbCustomRecyle;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CustomRecyleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCustomRecyle> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbCustomRecyle custom_recyle);


	/**
	 * 修改
	 */
	public void update(TbCustomRecyle custom_recyle);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCustomRecyle findOne(Integer id);


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
	public PageInfo findPage(TbCustomRecyle custom_recyle, int pageNum, int pageSize);

    Long findCustomOrder();

	Long findRecyleOrder();

	Long findTotalCustomOrder();

	Long totalRecyleOrder();
}
