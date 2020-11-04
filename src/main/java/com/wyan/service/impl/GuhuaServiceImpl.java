package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbGuhuaMapper;
import com.wyan.pojo.TbGuhua;
import com.wyan.pojo.TbGuhuaExample;
import com.wyan.pojo.TbGuhuaExample.Criteria;
import com.wyan.service.GuhuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GuhuaServiceImpl implements GuhuaService {

	@Autowired
	private TbGuhuaMapper guhuaMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGuhua> findAll() {
		return guhuaMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbGuhua> list=    guhuaMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbGuhua guhua) {
		guhuaMapper.insert(guhua);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbGuhua guhua){
		guhuaMapper.updateByPrimaryKey(guhua);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGuhua findOne(Integer id){
		return guhuaMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			guhuaMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbGuhua guhua, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGuhuaExample example=new TbGuhuaExample();
		Criteria criteria = example.createCriteria();
		
		if(guhua!=null){			
						if(guhua.getUsername()!=null && guhua.getUsername().length()>0){
				criteria.andUsernameLike("%"+guhua.getUsername()+"%");
			}			if(guhua.getIp()!=null && guhua.getIp().length()>0){
				criteria.andIpLike("%"+guhua.getIp()+"%");
			}	
		}
		
		List<TbGuhua> list= guhuaMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
