package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbCustomRecyle;
import com.wyan.service.CustomRecyleService;
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
@RequestMapping("/customRecyle")
public class CustomRecyleController {

	@Autowired
	private CustomRecyleService customRecyleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCustomRecyle> findAll(){			
		return customRecyleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return customRecyleService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param customRecyle
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCustomRecyle customRecyle){
		try {
			customRecyleService.add(customRecyle);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param customRecyle
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCustomRecyle customRecyle){
		try {
			customRecyleService.update(customRecyle);
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
	public TbCustomRecyle findOne(Integer id){
		return customRecyleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			customRecyleService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param customRecyle
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search( TbCustomRecyle customRecyle, int page, int limit  ){
		PageResult pageResult = new PageResult();
		try {
			PageInfo pi = customRecyleService.findPage(customRecyle,page,limit);

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
