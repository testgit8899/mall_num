package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbLink;
import com.wyan.service.AdminService;
import com.wyan.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/link")
public class LinkController {

	@Autowired
	private LinkService linkService;

	@Autowired
	private AdminService adminService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbLink> findAll(){			
		return linkService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		String username = SecurityContextHolder.getContext().getAuthentication().getName();

		return linkService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param link
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbLink link){
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			TbAdmin admin = adminService.findByName(username);
			link.setNetNum(admin.getNetNum());
			linkService.add(link);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param link
	 * @return
	 */
	@RequestMapping("/update")
	public Result update( TbLink link){
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			TbAdmin admin = adminService.findByName(username);
			link.setNetNum(admin.getNetNum());
			linkService.update(link);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param linkid
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbLink findOne(Integer linkid){
		return linkService.findOne(linkid);		
	}
	
	/**
	 * 批量删除
	 * @param linkids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] linkids){
		try {
			linkService.delete(linkids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param link
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(TbLink link, int page, int limit  ){
		PageResult result = new PageResult();
		PageInfo<TbLink> pi = linkService.findPage(link,page,limit);
		result.setSuccess(true);
		result.setCount(pi.getTotal());
		result.setData(pi.getList());
		result.setCode(CommonValue.OK);

		return result;
	}
	
}
