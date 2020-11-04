package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbActiveLogMapper;
import com.wyan.pojo.TbActiveLog;
import com.wyan.pojo.TbActiveLogExample;
import com.wyan.pojo.TbActiveLogExample.Criteria;
import com.wyan.service.ActiveLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ActiveLogServiceImpl implements ActiveLogService {

	@Autowired
	private TbActiveLogMapper activeLogMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbActiveLog> findAll() {
		return activeLogMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbActiveLog> list=    activeLogMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbActiveLog activeLog) {
		activeLogMapper.insert(activeLog);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbActiveLog activeLog){
		activeLogMapper.updateByPrimaryKey(activeLog);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbActiveLog findOne(Long id){
		return activeLogMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			activeLogMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbActiveLog activeLog, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbActiveLogExample example=new TbActiveLogExample();
		Criteria criteria = example.createCriteria();
		
		if(activeLog!=null){			
						if(activeLog.getIp()!=null && activeLog.getIp().length()>0){
				criteria.andIpLike("%"+activeLog.getIp()+"%");
			}			if(activeLog.getAddTime()!=null && activeLog.getAddTime().length()>0){
				criteria.andAddTimeLike("%"+activeLog.getAddTime()+"%");
			}			if(activeLog.getAddDay()!=null && activeLog.getAddDay().length()>0){
				criteria.andAddDayLike("%"+activeLog.getAddDay()+"%");
			}			if(activeLog.getAddMonth()!=null && activeLog.getAddMonth().length()>0){
				criteria.andAddMonthLike("%"+activeLog.getAddMonth()+"%");
			}			if(activeLog.getAddYear()!=null && activeLog.getAddYear().length()>0){
				criteria.andAddYearLike("%"+activeLog.getAddYear()+"%");
			}	
		}
		
		List<TbActiveLog> list= activeLogMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
