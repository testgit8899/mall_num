package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.DateUtil;
import com.wyan.mapper.CountDataMapper;
import com.wyan.mapper.TbAdminMapper;
import com.wyan.mapper.TbCashLogMapper;
import com.wyan.pojo.CountData;
import com.wyan.pojo.TbCashLog;
import com.wyan.pojo.TbCashLogExample;
import com.wyan.pojo.TbCashLogExample.Criteria;
import com.wyan.service.CashLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
@Transactional
public class CashLogServiceImpl implements CashLogService {

	@Autowired
	private TbCashLogMapper cashLogMapper;

	@Autowired
	private CountDataMapper countDataMapper;

	
	/**
	 * 查询全部
     * @param cashLog
     */
	@Override
	public List<TbCashLog> findAll(TbCashLog cashLog) {
		TbCashLogExample example=new TbCashLogExample();
		Criteria criteria = example.createCriteria();

		if(cashLog!=null){
			if(cashLog.getAgentName()!=null && cashLog.getAgentName().length()>0){
				criteria.andAgentNameLike("%"+cashLog.getAgentName()+"%");
			}			if(cashLog.getAgentShop()!=null && cashLog.getAgentShop().length()>0){
				criteria.andAgentShopLike("%"+cashLog.getAgentShop()+"%");
			}
		}
		return cashLogMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbCashLog> list=    cashLogMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCashLog cashLog) throws Exception {

		cashLog.setState(CommonValue.WAIT_CASH);
		//修改统计数据中的可用余额
		CountData countData = countDataMapper.findByUserId(cashLog.getUserId().intValue());
		Integer money = countData.getAvilableMoney()-cashLog.getCashMoney();
		if(money<=0){
			throw new Exception("金额不足");
		}
		cashLog.setApplyTime(DateUtil.formatDateToStr(new Date()));
		countData.setAvilableMoney(money);
		countDataMapper.updateInfo(countData);
		cashLogMapper.insert(cashLog);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCashLog cashLog){
		cashLogMapper.updateByPrimaryKey(cashLog);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCashLog findOne(Long id){
		return cashLogMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cashLogMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbCashLog cashLog, int page, int limit) {

		PageHelper.startPage(page, limit);
		TbCashLogExample example=new TbCashLogExample();
		Criteria criteria = example.createCriteria();
		
		if(cashLog!=null){			
			if(cashLog.getAgentName()!=null && cashLog.getAgentName().length()>0){
				criteria.andAgentNameLike("%"+cashLog.getAgentName()+"%");
			}if(cashLog.getAgentShop()!=null && cashLog.getAgentShop().length()>0){
				criteria.andAgentShopLike("%"+cashLog.getAgentShop()+"%");
			}if(cashLog.getRoleType()!=null ){
				criteria.andRoleEqualTo(cashLog.getRoleType());
			}
			if(cashLog.getState()!=null ){
				criteria.andStateEqualTo(cashLog.getState());
			}
			if(cashLog.getType()!=null ){
				criteria.andTypeEqualTo(cashLog.getType());
			}
			if(cashLog.getUserId()!=null){
				criteria.andUserIdEqualTo(cashLog.getUserId());
			}
		}
		List<TbCashLog> list= cashLogMapper.selectByExample(example);
		return new PageInfo(list);
	}

	//管理员统计昨日支出
	@Override
	public Long findCostMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.fomartYearsTody();
		String dateStr2  = DateUtil.fomartToday();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
		Long money =cashLogMapper.findCostMoney(map);
		if(null==money){
		    return 0l;
        }
		return money;
	}

	@Override
	public Long findMonthCostMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.getMonthStart();
		String dateStr2  = DateUtil.getMonthEnd();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
		Long money =cashLogMapper.findCostMoney(map);
		if(null==money){
			return 0l;
		}
		return money;
	}

	@Override
	public Long findTotalCostMoney() {
		Map map = new HashMap();
		Long money =cashLogMapper.findCostMoney(map);
		if(null==money){
			return 0l;
		}
		return money;
	}

	@Override
	public Long yearCostMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.getYearStart();
		String dateStr2  = DateUtil.getYearEnd();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
		Long money =cashLogMapper.findCostMoney(map);
		if(null==money){
			return 0l;
		}
		return money;
	}

	@Override
	public void updateState(TbCashLog cashLog) {

		cashLogMapper.updateState(cashLog);
	}

	@Override
	public void updateImg(TbCashLog cashLog) {
		cashLogMapper.updateImg(cashLog);
	}


}
