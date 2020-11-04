package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbH400Mapper;
import com.wyan.pojo.TbH400;
import com.wyan.pojo.TbH400Example;
import com.wyan.pojo.TbH400Example.Criteria;
import com.wyan.service.H400Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class H400ServiceImpl implements H400Service {

	@Autowired
	private TbH400Mapper h400Mapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbH400> findAll() {
		return h400Mapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbH400> list=    h400Mapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbH400 h400) {
		h400Mapper.insert(h400);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbH400 h400){
		h400Mapper.updateByPrimaryKey(h400);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbH400 findOne(Integer id){
		return h400Mapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			h400Mapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbH400 h400, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbH400Example example=new TbH400Example();
		Criteria criteria = example.createCriteria();
		
		if(h400!=null){			
						if(h400.getUsername()!=null && h400.getUsername().length()>0){
				criteria.andUsernameLike("%"+h400.getUsername()+"%");
			}			if(h400.getIp()!=null && h400.getIp().length()>0){
				criteria.andIpLike("%"+h400.getIp()+"%");
			}	
		}
		
		List<TbH400> list= h400Mapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
