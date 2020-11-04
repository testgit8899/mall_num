package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbAttachmentIndex;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AttachmentIndexService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbAttachmentIndex> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbAttachmentIndex attachment_index);



	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbAttachmentIndex attachment_index, int pageNum, int pageSize);
	
}
