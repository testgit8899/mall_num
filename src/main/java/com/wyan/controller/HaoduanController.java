package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbHaoduan;
import com.wyan.service.HaoduanService;
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
@RequestMapping("/haoduan")
public class HaoduanController {

	@Autowired
	private HaoduanService haoduanService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbHaoduan> findAll(){			
		return haoduanService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return haoduanService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param haoduan
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbHaoduan haoduan){
		try {
			haoduanService.add(haoduan);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param haoduan
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbHaoduan haoduan){
		try {
			haoduanService.update(haoduan);
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
	public TbHaoduan findOne(Integer id){
		return haoduanService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			haoduanService.delete(ids);
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
	public PageInfo search(@RequestBody TbHaoduan haoduan, int pageNum, int pageSize  ){
		return haoduanService.findPage(haoduan, pageNum, pageSize);
	}
	
}
