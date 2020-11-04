package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.EntityResult;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbArticle;
import com.wyan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbArticle> findAll(){			
		return articleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return articleService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param article
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbArticle article){
		try {
			article.setAddtime(new Date());
			articleService.add(article);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param article
	 * @return
	 */
	@RequestMapping("/update")
	public Result update( TbArticle article){
		try {
			articleService.update(article);
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
	public EntityResult findOne(Integer id){
		EntityResult entityResult = new EntityResult();
		entityResult.setData(articleService.findOne(id));
		entityResult.setSuccess(true);
		return entityResult;
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			articleService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param article
	 * @param limit
	 * @param page
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(TbArticle article, int page, int limit  ){

		PageResult pageResult =  new PageResult();
		PageInfo<TbArticle> pi  = articleService.findPage(article, page, limit);
		pageResult.setCode(CommonValue.OK);
		pageResult.setCount(pi.getTotal());
		pageResult.setData(pi.getList());

		return pageResult;
	}
	
}
