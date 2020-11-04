package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbAttachment;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AttachmentService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbAttachment> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbAttachment attachment);


	/**
	 * 修改
	 */
	public void update(TbAttachment attachment);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbAttachment findOne(Integer aid);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] aids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbAttachment attachment, int pageNum, int pageSize);
	
}
