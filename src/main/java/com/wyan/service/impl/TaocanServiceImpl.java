package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbTaocanMapper;
import com.wyan.pojo.TbTaocan;
import com.wyan.pojo.TbTaocanExample;
import com.wyan.pojo.TbTaocanExample.Criteria;
import com.wyan.service.TaocanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TaocanServiceImpl implements TaocanService {

	@Autowired
	private TbTaocanMapper taocanMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTaocan> findAll() {
		return taocanMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbTaocan> list=    taocanMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTaocan taocan) {
		taocanMapper.insert(taocan);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTaocan taocan){
		taocanMapper.updateByPrimaryKey(taocan);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbTaocan findOne(Integer id){
		return taocanMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			taocanMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbTaocan taocan, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTaocanExample example=new TbTaocanExample();
		Criteria criteria = example.createCriteria();
		
		if(taocan!=null){			
						if(taocan.getName()!=null && taocan.getName().length()>0){
				criteria.andNameLike("%"+taocan.getName()+"%");
			}			if(taocan.getIp()!=null && taocan.getIp().length()>0){
				criteria.andIpLike("%"+taocan.getIp()+"%");
			}	
		}
		
		List<TbTaocan> list= taocanMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
