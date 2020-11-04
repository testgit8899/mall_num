package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbAttachmentIndexMapper;
import com.wyan.pojo.TbAttachmentIndex;
import com.wyan.pojo.TbAttachmentIndexExample;
import com.wyan.pojo.TbAttachmentIndexExample.Criteria;
import com.wyan.service.AttachmentIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AttachmentIndexServiceImpl implements AttachmentIndexService {

	@Autowired
	private TbAttachmentIndexMapper attachmentIndexMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAttachmentIndex> findAll() {
		return attachmentIndexMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbAttachmentIndex> list=    attachmentIndexMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAttachmentIndex attachmentIndex) {
		attachmentIndexMapper.insert(attachmentIndex);		
	}


	@Override
	public PageInfo findPage(TbAttachmentIndex attachmentIndex, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAttachmentIndexExample example=new TbAttachmentIndexExample();
		Criteria criteria = example.createCriteria();
		
		if(attachmentIndex!=null){			
						if(attachmentIndex.getAid()!=null && attachmentIndex.getAid().length()>0){
				criteria.andAidLike("%"+attachmentIndex.getAid()+"%");
			}	
		}
		
		List<TbAttachmentIndex> list= attachmentIndexMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
