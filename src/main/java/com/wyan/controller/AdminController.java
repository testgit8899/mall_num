package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.EntityResult;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbAdmin;
import com.wyan.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAllSeller")
	public List<TbAdmin> findAllSeller(){
		return adminService.findAllSeller();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return adminService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param admin
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbAdmin admin){
		try {
			if (null!=admin.getUserid()) {
				adminService.update(admin);
			}else{
				adminService.add(admin);
			}
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param admin
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbAdmin admin){
		try {
			adminService.update(admin);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param userid
	 * @return
	 */
	@RequestMapping("/findOne")
	public EntityResult findOne(Integer userid){
		TbAdmin admin = adminService.findOne(userid);
		EntityResult result = new EntityResult();
		result.setCode(CommonValue.OK);
		result.setData(admin);
		result.setMsg("成功");
		result.setSuccess(true);
		return 	result;
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			adminService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	/**
	 * 批量删除
	 * @param userid
	 * @return
	 */
	@RequestMapping("/deleteById")
	public Result delete(Integer  userid){
		try {
			adminService.deleteById(userid);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
		/**
	 * 查询+分页
	 * @param admin
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search( TbAdmin admin, int page, int limit  ){
		PageResult pageResult = new PageResult();
		try {
			PageInfo pi = adminService.findPage(admin, page, limit);
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
    /**
     * 查询+分页
     * @param admin
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/searchAgent")
    public PageResult searchAgent( TbAdmin admin, int page, int limit  ){
        PageResult pageResult = new PageResult();
        try {
            PageInfo pi = adminService.searchAgent(admin, page, limit);
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

	/**
	 */
	@RequestMapping("/modifyUserState")
	public Result modifyUserState( Integer [] ids,Integer state  ){

		adminService.modifyUserState(ids,state);

		return new Result(true,"操作成功");
	}
}
