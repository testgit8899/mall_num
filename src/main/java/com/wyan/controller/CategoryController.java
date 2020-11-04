package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbCategory;
import com.wyan.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCategory> findAll(){			
		return categoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return categoryService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param category
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCategory category){
		try {
			categoryService.add(category);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param category
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCategory category){
		try {
			categoryService.update(category);
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
	public TbCategory findOne(Integer catid){
		return categoryService.findOne(catid);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] catids){
		try {
			categoryService.delete(catids);
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
	public PageInfo search(@RequestBody TbCategory category, int pageNum, int pageSize  ){
		return categoryService.findPage(category, pageNum, pageSize);
	}
	
}
