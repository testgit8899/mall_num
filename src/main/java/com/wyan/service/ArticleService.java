package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.TbArticle;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ArticleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbArticle> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbArticle article);


	/**
	 * 修改
	 */
	public void update(TbArticle article);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbArticle findOne(Integer id);


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
	public PageInfo findPage(TbArticle article, int pageNum, int pageSize);
	
}
