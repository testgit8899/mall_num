package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbHaoduanMapper;
import com.wyan.pojo.TbHaoduan;
import com.wyan.pojo.TbHaoduanExample;
import com.wyan.pojo.TbHaoduanExample.Criteria;
import com.wyan.service.HaoduanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HaoduanServiceImpl implements HaoduanService {

	@Autowired
	private TbHaoduanMapper haoduanMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbHaoduan> findAll() {
		return haoduanMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbHaoduan> list=    haoduanMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHaoduan haoduan) {
		haoduanMapper.insert(haoduan);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHaoduan haoduan){
		haoduanMapper.updateByPrimaryKey(haoduan);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbHaoduan findOne(Integer id){
		return haoduanMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			haoduanMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbHaoduan haoduan, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbHaoduanExample example=new TbHaoduanExample();
		Criteria criteria = example.createCriteria();
		
		if(haoduan!=null){			
				
		}
		
		List<TbHaoduan> list= haoduanMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
