package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.PageResult;
import com.wyan.pojo.AccountBill;
import com.wyan.pojo.TbAdmin;
import com.wyan.service.AccountstatementService;
import com.wyan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerError;
import java.util.HashMap;
import java.util.Map;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/accountstatement")
public class AccountstatementController {

	@Autowired
	private AccountstatementService accountstatementService;

	@Autowired
	private AdminService adminService;

		/**
	 * 查询+分页
	 * @param accountstatement
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(AccountBill accountstatement, int page, int limit  ){
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TbAdmin admin = adminService.findByName(username);
		accountstatement.setUser_id(admin.getUserid());
		PageResult pageResult = new PageResult();
		try {
			PageInfo pi = accountstatementService.findPage(accountstatement,page,limit);
			pageResult.setCode(CommonValue.OK);
			pageResult.setCount(pi.getTotal());
			pageResult.setData(pi.getList());

		} catch (Exception e) {
			e.printStackTrace();
			pageResult.setCode(CommonValue.FAILE);
			pageResult.setMsg("服务器繁忙");
		}
		return pageResult;
	}


	@RequestMapping("/countMoneyByUser")
	public Map countMoneyByUser(AccountBill accountstatement  ){
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TbAdmin admin = adminService.findByName(username);
		accountstatement.setUser_id(admin.getUserid());
		Map map = accountstatementService.countMoneyByUser(accountstatement);
		return map;
	}
}
