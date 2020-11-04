package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbOrder;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface OrderService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbOrder> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbOrder order);


	/**
	 * 修改
	 */
	public void update(TbOrder order);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbOrder findOne(Long orderNo);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] orderNos);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbOrder order, int pageNum, int pageSize);

    Long findHaomaOrder();

	Long findMonthReviceMoney();

	Long findReviceMoney();

	Long totalNum();

	Long totalReviceMoney();

	Long yearReceiveMoney();
}
