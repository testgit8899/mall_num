package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbLoginLog;
import com.wyan.service.LoginLogService;
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
@RequestMapping("/loginLog")
public class LoginLogController {

	@Autowired
	private LoginLogService loginLogService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbLoginLog> findAll(){			
		return loginLogService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return loginLogService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param loginLog
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbLoginLog loginLog){
		try {
			loginLogService.add(loginLog);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param loginLog
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbLoginLog loginLog){
		try {
			loginLogService.update(loginLog);
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
	public TbLoginLog findOne(Long id){
		return loginLogService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			loginLogService.delete(ids);
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
	public PageInfo search(@RequestBody TbLoginLog loginLog, int pageNum, int pageSize  ){
		return loginLogService.findPage(loginLog, pageNum, pageSize);
	}
	
}
