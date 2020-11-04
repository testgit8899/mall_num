package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbLoginLog;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface LoginLogService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbLoginLog> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbLoginLog login_log);


	/**
	 * 修改
	 */
	public void update(TbLoginLog login_log);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbLoginLog findOne(Long id);


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
	public PageInfo findPage(TbLoginLog login_log, int pageNum, int pageSize);
	
}
