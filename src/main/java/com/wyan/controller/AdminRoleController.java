package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbAdminRole;
import com.wyan.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/adminRole")
public class AdminRoleController {

	@Autowired
	private AdminRoleService adminRoleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAdminRole> findAll(){			
		return adminRoleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return adminRoleService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param adminRole
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbAdminRole adminRole){
		try {
			adminRoleService.add(adminRole);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param adminRole
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbAdminRole adminRole){
		try {
			adminRoleService.update(adminRole);
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
	public TbAdminRole findOne(Integer roleid){
		return adminRoleService.findOne(roleid);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] roleids){
		try {
			adminRoleService.delete(roleids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/search")
	public PageInfo search(@RequestBody TbAdminRole adminRole, int pageNum, int pageSize  ){
		return adminRoleService.findPage(adminRole, pageNum, pageSize);
	}
	
}
