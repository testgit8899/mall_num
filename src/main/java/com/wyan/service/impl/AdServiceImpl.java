package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbAdMapper;
import com.wyan.pojo.TbAd;
import com.wyan.pojo.TbAdExample;
import com.wyan.pojo.TbAdExample.Criteria;
import com.wyan.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdServiceImpl implements AdService {

	@Autowired
	private TbAdMapper adMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAd> findAll() {
		return adMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbAd> list=    adMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAd ad) {
		adMapper.insert(ad);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbAd ad){
		adMapper.updateByPrimaryKey(ad);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbAd findOne(Integer id){
		return adMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			adMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbAd ad, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAdExample example=new TbAdExample();
		Criteria criteria = example.createCriteria();

		List<TbAd> list= adMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
