package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.TbLoginLogMapper;
import com.wyan.pojo.TbLoginLog;
import com.wyan.pojo.TbLoginLogExample;
import com.wyan.pojo.TbLoginLogExample.Criteria;
import com.wyan.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {

	@Autowired
	private TbLoginLogMapper loginLogMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbLoginLog> findAll() {
		return loginLogMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbLoginLog> list=    loginLogMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbLoginLog loginLog) {
		loginLogMapper.insert(loginLog);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbLoginLog loginLog){
		loginLogMapper.updateByPrimaryKey(loginLog);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbLoginLog findOne(Long id){
		return loginLogMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			loginLogMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbLoginLog loginLog, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbLoginLogExample example=new TbLoginLogExample();
		Criteria criteria = example.createCriteria();
		
		if(loginLog!=null){			
						if(loginLog.getUsername()!=null && loginLog.getUsername().length()>0){
				criteria.andUsernameLike("%"+loginLog.getUsername()+"%");
			}			if(loginLog.getPassword()!=null && loginLog.getPassword().length()>0){
				criteria.andPasswordLike("%"+loginLog.getPassword()+"%");
			}			if(loginLog.getLoginip()!=null && loginLog.getLoginip().length()>0){
				criteria.andLoginipLike("%"+loginLog.getLoginip()+"%");
			}			if(loginLog.getMessage()!=null && loginLog.getMessage().length()>0){
				criteria.andMessageLike("%"+loginLog.getMessage()+"%");
			}			if(loginLog.getAgent()!=null && loginLog.getAgent().length()>0){
				criteria.andAgentLike("%"+loginLog.getAgent()+"%");
			}	
		}
		
		List<TbLoginLog> list= loginLogMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
