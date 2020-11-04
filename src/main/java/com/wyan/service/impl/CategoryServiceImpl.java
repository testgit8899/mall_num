package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbCategoryMapper;
import com.wyan.pojo.TbCategory;
import com.wyan.pojo.TbCategoryExample;
import com.wyan.pojo.TbCategoryExample.Criteria;
import com.wyan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private TbCategoryMapper categoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCategory> findAll() {
		return categoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbCategory> list=    categoryMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCategory category) {
		categoryMapper.insert(category);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCategory category){
		categoryMapper.updateByPrimaryKey(category);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCategory findOne(Integer catid){
		return categoryMapper.selectByPrimaryKey(catid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] catids) {
		for(Integer catid:catids){
			categoryMapper.deleteByPrimaryKey(catid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbCategory category, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCategoryExample example=new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		
		if(category!=null){			
						if(category.getModule()!=null && category.getModule().length()>0){
				criteria.andModuleLike("%"+category.getModule()+"%");
			}			if(category.getArrparentid()!=null && category.getArrparentid().length()>0){
				criteria.andArrparentidLike("%"+category.getArrparentid()+"%");
			}			if(category.getCatname()!=null && category.getCatname().length()>0){
				criteria.andCatnameLike("%"+category.getCatname()+"%");
			}			if(category.getStyle()!=null && category.getStyle().length()>0){
				criteria.andStyleLike("%"+category.getStyle()+"%");
			}			if(category.getImage()!=null && category.getImage().length()>0){
				criteria.andImageLike("%"+category.getImage()+"%");
			}			if(category.getParentdir()!=null && category.getParentdir().length()>0){
				criteria.andParentdirLike("%"+category.getParentdir()+"%");
			}			if(category.getCatdir()!=null && category.getCatdir().length()>0){
				criteria.andCatdirLike("%"+category.getCatdir()+"%");
			}			if(category.getUrl()!=null && category.getUrl().length()>0){
				criteria.andUrlLike("%"+category.getUrl()+"%");
			}			if(category.getLetter()!=null && category.getLetter().length()>0){
				criteria.andLetterLike("%"+category.getLetter()+"%");
			}			if(category.getUsableType()!=null && category.getUsableType().length()>0){
				criteria.andUsableTypeLike("%"+category.getUsableType()+"%");
			}	
		}
		
		List<TbCategory> list= categoryMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
