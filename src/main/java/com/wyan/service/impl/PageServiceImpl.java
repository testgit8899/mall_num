package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbPageMapper;
import com.wyan.pojo.TbPage;
import com.wyan.pojo.TbPageExample;
import com.wyan.pojo.TbPageExample.Criteria;
import com.wyan.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PageServiceImpl implements PageService {

	@Autowired
	private TbPageMapper pageMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPage> findAll() {
		return pageMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbPage> list=    pageMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPage page) {
		pageMapper.insert(page);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPage page){
		pageMapper.updateByPrimaryKey(page);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPage findOne(Integer catid){
		return pageMapper.selectByPrimaryKey(catid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] catids) {
		for(Integer catid:catids){
			pageMapper.deleteByPrimaryKey(catid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbPage page, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbPageExample example=new TbPageExample();
		Criteria criteria = example.createCriteria();
		
		if(page!=null){			
						if(page.getTitle()!=null && page.getTitle().length()>0){
				criteria.andTitleLike("%"+page.getTitle()+"%");
			}			if(page.getStyle()!=null && page.getStyle().length()>0){
				criteria.andStyleLike("%"+page.getStyle()+"%");
			}			if(page.getKeywords()!=null && page.getKeywords().length()>0){
				criteria.andKeywordsLike("%"+page.getKeywords()+"%");
			}			if(page.getTemplate()!=null && page.getTemplate().length()>0){
				criteria.andTemplateLike("%"+page.getTemplate()+"%");
			}	
		}
		
		List<TbPage> list= pageMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
