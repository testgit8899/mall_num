package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbPage404Mapper;
import com.wyan.pojo.TbPage404;
import com.wyan.pojo.TbPage404Example;
import com.wyan.pojo.TbPage404Example.Criteria;
import com.wyan.service.Page404Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class Page404ServiceImpl implements Page404Service {

	@Autowired
	private TbPage404Mapper page404Mapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPage404> findAll() {
		return page404Mapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbPage404> list=    page404Mapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPage404 page404) {
		page404Mapper.insert(page404);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPage404 page404){
		page404Mapper.updateByPrimaryKey(page404);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPage404 findOne(Integer id){
		return page404Mapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			page404Mapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbPage404 page404, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbPage404Example example=new TbPage404Example();
		Criteria criteria = example.createCriteria();
		
		if(page404!=null){			
						if(page404.getUrl()!=null && page404.getUrl().length()>0){
				criteria.andUrlLike("%"+page404.getUrl()+"%");
			}			if(page404.getRobot()!=null && page404.getRobot().length()>0){
				criteria.andRobotLike("%"+page404.getRobot()+"%");
			}			if(page404.getUsername()!=null && page404.getUsername().length()>0){
				criteria.andUsernameLike("%"+page404.getUsername()+"%");
			}			if(page404.getIp()!=null && page404.getIp().length()>0){
				criteria.andIpLike("%"+page404.getIp()+"%");
			}	
		}
		
		List<TbPage404> list= page404Mapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
