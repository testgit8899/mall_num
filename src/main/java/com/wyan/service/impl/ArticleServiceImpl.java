package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbArticleMapper;
import com.wyan.pojo.TbArticle;
import com.wyan.pojo.TbArticleExample;
import com.wyan.pojo.TbArticleExample.Criteria;
import com.wyan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private TbArticleMapper articleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbArticle> findAll() {
		return articleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbArticle> list=    articleMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbArticle article) {
		articleMapper.insert(article);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbArticle article){
		articleMapper.updateByPrimaryKey(article);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbArticle findOne(Integer id){
		return articleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			articleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbArticle article, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbArticleExample example=new TbArticleExample();
		Criteria criteria = example.createCriteria();
		
		if(article!=null){			
						if(article.getTitle()!=null && article.getTitle().length()>0){
				criteria.andTitleLike("%"+article.getTitle()+"%");
			}
		}
		
		List<TbArticle> list= articleMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
