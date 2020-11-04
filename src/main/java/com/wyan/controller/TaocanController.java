package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbTaocan;
import com.wyan.service.TaocanService;
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
@RequestMapping("/taocan")
public class TaocanController {

	@Autowired
	private TaocanService taocanService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbTaocan> findAll(){			
		return taocanService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return taocanService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param taocan
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbTaocan taocan){
		try {
			taocanService.add(taocan);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param taocan
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTaocan taocan){
		try {
			taocanService.update(taocan);
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
	public TbTaocan findOne(Integer id){
		return taocanService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			taocanService.delete(ids);
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
	public PageInfo search(@RequestBody TbTaocan taocan, int pageNum, int pageSize  ){
		return taocanService.findPage(taocan, pageNum, pageSize);
	}
	
}
