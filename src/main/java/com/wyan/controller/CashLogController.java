package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.EntityResult;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbCashLog;
import com.wyan.service.AdminService;
import com.wyan.service.CashLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cashLog")
public class CashLogController {

	@Autowired
	private CashLogService cashLogService;
	
	@Autowired
	private AdminService adminService;


	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return cashLogService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param cashLog
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbCashLog cashLog){
		try {
			TbAdmin admin = adminService.findByName(SecurityContextHolder.getContext().getAuthentication().getName());
			cashLog.setAgentName(admin.getUsername());
			cashLog.setAgentShop(admin.getRealname());
			cashLog.setUserId(new Long(admin.getUserid()));
			cashLog.setRoleType(admin.getRoleid());
			cashLogService.add(cashLog);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cashLog
	 * @return
	 */
	@RequestMapping("/updateImg")
	public Result updateImg( TbCashLog cashLog){
		try {
			TbAdmin admin = adminService.findByName(SecurityContextHolder.getContext().getAuthentication().getName());
			if(admin.getRoleid()!=1){
				 return new Result(false, "管理员才欧权限");
			}
			cashLog.setState(CommonValue.COMPLETE_CASH);
			cashLogService.updateImg(cashLog);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	/**
	 * 修改
	 * @param cashLog
	 * @return
	 */
	@RequestMapping("/updateState")
	public Result updateState( TbCashLog cashLog){
		try {
			cashLogService.updateState(cashLog);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public EntityResult findOne(Long id){

		TbCashLog cashLog= cashLogService.findOne(id);
		EntityResult result = new EntityResult();
		result.setData(cashLog);
		result.setSuccess(true);
		result.setCode(CommonValue.OK);
		return result;
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cashLogService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param cashLog
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(TbCashLog cashLog, int page, int limit  ){
		PageResult pageResult = new PageResult();
		TbAdmin admin = adminService.findByName(SecurityContextHolder.getContext().getAuthentication().getName());
		if(null==cashLog){
			cashLog=new TbCashLog();
		}
		if(admin.getRoleid()!=1){
			cashLog.setUserId(new Long(admin.getUserid()));
		}
		PageInfo pi = cashLogService.findPage(cashLog, page, limit);
		pageResult.setData(pi.getList());
		pageResult.setCode(CommonValue.OK);
		pageResult.setCount(pi.getTotal());
		return pageResult;
	}
	
}
