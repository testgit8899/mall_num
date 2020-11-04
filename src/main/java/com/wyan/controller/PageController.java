package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbPage;
import com.wyan.service.PageService;
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
@RequestMapping("/page")
public class PageController {

	@Autowired
	private PageService pageService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbPage> findAll(){			
		return pageService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return pageService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param page
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbPage page){
		try {
			pageService.add(page);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param page
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbPage page){
		try {
			pageService.update(page);
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
	public TbPage findOne(Integer catid){
		return pageService.findOne(catid);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] catids){
		try {
			pageService.delete(catids);
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
	public PageInfo search(@RequestBody TbPage page, int pageNum, int pageSize  ){
		return pageService.findPage(page, pageNum, pageSize);
	}
	
}
