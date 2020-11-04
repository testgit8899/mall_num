package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.AccountBill;

import java.util.Map;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AccountstatementService {


	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(AccountBill accountstatement, int pageNum, int pageSize);

	Map countMoneyByUser(AccountBill accountstatement);
}
