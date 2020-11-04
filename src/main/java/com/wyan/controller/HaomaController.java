package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.*;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbHaoma;
import com.wyan.service.AdminService;
import com.wyan.service.HaomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/haoma")
public class HaomaController {

	@Autowired
	private HaomaService haomaService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private IdWorker idWorker;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbHaoma> findAll(){
		return haomaService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "20")Integer limit){
		return haomaService.findPage(page, limit);
	}
	
	/**
	 * 增加
	 * @param haoma
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbHaoma haoma){
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			TbAdmin admin = adminService.findByName(username);
			if(haoma.getId()==null){
				haoma.setId(idWorker.nextId()+"");
				haoma.setStatus(CommonValue.NORMAL);
				haoma.setAddtime(new Date());
				haoma.setNetNum(admin.getNetNum());
				haoma.setAgentId(admin.getUserid());
				haoma.setSeller(admin.getRealname());
				haoma.setAgentPrice(0);
				haoma.setProvinceName(haoma.getProvinceName().split(",")[1]);
				haoma.setCityName(haoma.getCityName().split(",")[1]);
				haomaService.add(haoma);
			}else{
				haomaService.update(haoma);
			}
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param haoma
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(TbHaoma haoma){
		try {
			haomaService.update(haoma);
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
	public EntityResult findOne(String id){
		TbHaoma haoma =haomaService.findOne(id);
		EntityResult result = new EntityResult();
		result.setData(haoma);
		result.setCode(10000);
		return 	result;
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			haomaService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param haoma
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search( TbHaoma haoma,
							 @RequestParam(defaultValue = "1") Integer page,
							 @RequestParam(defaultValue = "20")Integer limit ){
		PageResult pageResult = new PageResult();
		try {
			PageInfo pi = haomaService.findPage(haoma,page,limit);

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
	
}
