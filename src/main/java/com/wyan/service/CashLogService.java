package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbCashLog;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CashLogService {

	/**
	 * 返回全部列表
	 * @return
     * @param cashLog
	 */
	public List<TbCashLog> findAll(TbCashLog cashLog);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbCashLog cash_log) throws Exception;


	/**
	 * 修改
	 */
	public void update(TbCashLog cash_log);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCashLog findOne(Long id);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbCashLog cash_log, int pageNum, int pageSize);

	Long findCostMoney();

	Long findMonthCostMoney();

	Long findTotalCostMoney();

	Long yearCostMoney();

	void updateState(TbCashLog cashLog);

	void updateImg(TbCashLog cashLog);
}
