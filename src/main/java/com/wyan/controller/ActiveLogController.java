package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbActiveLog;
import com.wyan.service.ActiveLogService;
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
@RequestMapping("/activeLog")
public class ActiveLogController {

	@Autowired
	private ActiveLogService activeLogService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbActiveLog> findAll(){			
		return activeLogService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return activeLogService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param activeLog
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbActiveLog activeLog){
		try {
			activeLogService.add(activeLog);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param activeLog
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbActiveLog activeLog){
		try {
			activeLogService.update(activeLog);
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
	public TbActiveLog findOne(Long id){
		return activeLogService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			activeLogService.delete(ids);
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
	public PageInfo search(@RequestBody TbActiveLog activeLog, int pageNum, int pageSize  ){
		return activeLogService.findPage(activeLog, pageNum, pageSize);
	}
	
}
