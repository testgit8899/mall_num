package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbAdSpaceMapper;
import com.wyan.pojo.TbAdSpace;
import com.wyan.pojo.TbAdSpaceExample;
import com.wyan.pojo.TbAdSpaceExample.Criteria;
import com.wyan.service.AdSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdSpaceServiceImpl implements AdSpaceService {

	@Autowired
	private TbAdSpaceMapper adSpaceMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAdSpace> findAll() {
		return adSpaceMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbAdSpace> list=    adSpaceMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAdSpace adSpace) {
		adSpaceMapper.insert(adSpace);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbAdSpace adSpace){
		adSpaceMapper.updateByPrimaryKey(adSpace);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbAdSpace findOne(Integer spaceid){
		return adSpaceMapper.selectByPrimaryKey(spaceid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] spaceids) {
		for(Integer spaceid:spaceids){
			adSpaceMapper.deleteByPrimaryKey(spaceid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbAdSpace adSpace, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAdSpaceExample example=new TbAdSpaceExample();
		Criteria criteria = example.createCriteria();
		
		if(adSpace!=null){			
				
		}
		
		List<TbAdSpace> list= adSpaceMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
