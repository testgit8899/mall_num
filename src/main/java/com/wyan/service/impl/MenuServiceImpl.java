package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbMenuMapper;
import com.wyan.pojo.TbMenu;
import com.wyan.pojo.TbMenuExample;
import com.wyan.pojo.TbMenuExample.Criteria;
import com.wyan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private TbMenuMapper menuMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMenu> findAll() {
		return menuMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbMenu> list=    menuMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMenu menu) {
		menuMapper.insert(menu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMenu menu){
		menuMapper.updateByPrimaryKey(menu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMenu findOne(Integer id){
		return menuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			menuMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbMenu menu, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMenuExample example=new TbMenuExample();
		Criteria criteria = example.createCriteria();
		
		if(menu!=null){			
				
		}
		
		List<TbMenu> list= menuMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
