package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbAdSpace;
import com.wyan.service.AdSpaceService;
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
@RequestMapping("/adSpace")
public class AdSpaceController {

	@Autowired
	private AdSpaceService adSpaceService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAdSpace> findAll(){			
		return adSpaceService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return adSpaceService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param adSpace
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbAdSpace adSpace){
		try {
			adSpaceService.add(adSpace);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param adSpace
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbAdSpace adSpace){
		try {
			adSpaceService.update(adSpace);
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
	public TbAdSpace findOne(Integer spaceid){
		return adSpaceService.findOne(spaceid);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] spaceids){
		try {
			adSpaceService.delete(spaceids);
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
	public PageInfo search(@RequestBody TbAdSpace adSpace, int pageNum, int pageSize  ){
		return adSpaceService.findPage(adSpace, pageNum, pageSize);
	}
	
}