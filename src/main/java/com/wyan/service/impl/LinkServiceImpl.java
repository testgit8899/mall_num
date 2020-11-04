package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.mapper.TbLinkMapper;
import com.wyan.pojo.TbAdminExample;
import com.wyan.pojo.TbLink;
import com.wyan.pojo.TbLinkExample;
import com.wyan.pojo.TbLinkExample.Criteria;
import com.wyan.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class LinkServiceImpl implements LinkService {

	@Autowired
	private TbLinkMapper linkMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbLink> findAll() {
		return linkMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbLink> list=    linkMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbLink link) {

		linkMapper.insert(link);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbLink link){
		linkMapper.updateByPrimaryKey(link);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param linkid
	 * @return
	 */
	@Override
	public TbLink findOne(Integer linkid){
		return linkMapper.selectByPrimaryKey(linkid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] linkids) {
		for(Integer linkid:linkids){
			linkMapper.deleteByPrimaryKey(linkid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbLink link, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		//当前用户信息
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		List<TbLink> list= linkMapper.selectByUserName(username);
		return new PageInfo(list);
	}
	
}
