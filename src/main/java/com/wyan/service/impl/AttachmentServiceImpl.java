package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbAttachmentMapper;
import com.wyan.pojo.TbAttachment;
import com.wyan.pojo.TbAttachmentExample;
import com.wyan.pojo.TbAttachmentExample.Criteria;
import com.wyan.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AttachmentServiceImpl implements AttachmentService {

	@Autowired
	private TbAttachmentMapper attachmentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAttachment> findAll() {
		return attachmentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbAttachment> list=    attachmentMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAttachment attachment) {
		attachmentMapper.insert(attachment);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbAttachment attachment){
		attachmentMapper.updateByPrimaryKey(attachment);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbAttachment findOne(Integer aid){
		return attachmentMapper.selectByPrimaryKey(aid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] aids) {
		for(Integer aid:aids){
			attachmentMapper.deleteByPrimaryKey(aid);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbAttachment attachment, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAttachmentExample example=new TbAttachmentExample();
		Criteria criteria = example.createCriteria();
		
		if(attachment!=null){			
				
		}
		
		List<TbAttachment> list= attachmentMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
