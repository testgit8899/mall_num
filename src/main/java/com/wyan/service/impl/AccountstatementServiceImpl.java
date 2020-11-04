package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.mapper.AccountBillMapper;
import com.wyan.pojo.AccountBill;
import com.wyan.service.AccountstatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AccountstatementServiceImpl implements AccountstatementService {

	@Autowired
	private AccountBillMapper accountstatementMapper;
	
	@Override
	public PageInfo findPage(AccountBill accountstatement, int pageNum, int pageSize) {
		Map searchMap = new HashMap<>();
		if(accountstatement.getUser_id()!=null){
			searchMap.put("userId",accountstatement.getUser_id());
		}
		if(accountstatement.getSaleType()!=null){
			searchMap.put("saleType",accountstatement.getSaleType());
		}
		if(accountstatement.getOrder_time()!=null&& !StringUtils.isEmpty(accountstatement.getOrder_time().trim())){
			System.out.println(accountstatement.getOrder_time());
			searchMap.put("startTime",accountstatement.getOrder_time().split(" - ")[0].trim());
			searchMap.put("endTime",accountstatement.getOrder_time().split(" - ")[1].trim());
		}
		PageHelper.startPage(pageNum, pageSize);
		List<AccountBill> list= accountstatementMapper.findAllBill(searchMap);
		return new PageInfo(list);
	}

	@Override
	public Map countMoneyByUser(AccountBill accountstatement) {
		Map searchMap = new HashMap();
		searchMap.put("userId",accountstatement.getUser_id());
		if(accountstatement.getOrder_time()!=null&& !StringUtils.isEmpty(accountstatement.getOrder_time().trim())){
			System.out.println(accountstatement.getOrder_time());
			searchMap.put("startTime",accountstatement.getOrder_time().split(" - ")[0].trim());
			searchMap.put("endTime",accountstatement.getOrder_time().split(" - ")[1].trim());
		}
		List<Map> maps = accountstatementMapper.countMoneyByUser(searchMap);
		if(maps!=null&&maps.size()>0){
			Map map = maps.get(0);
			map.put("dateStr",accountstatement.getOrder_time());
			return maps.get(0);
		}
		return null;
	}

}
