package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbAd;
import com.wyan.service.AdService;
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
@RequestMapping("/ad")
public class AdController {

	@Autowired
	private AdService adService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAd> findAll(){			
		return adService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return adService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param ad
	 * @return
	 */
	@RequestMapping("/add")
	public Result add( TbAd ad){
		try {
			adService.add(ad);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ad
	 * @return
	 */
	@RequestMapping("/update")
	public Result update( TbAd ad){
		try {
			adService.update(ad);
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
	public TbAd findOne(Integer id){
		return adService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			adService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param ad
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(TbAd ad, int page, int limit  ){
		PageResult result = new PageResult();
		result.setCode(CommonValue.OK);
		PageInfo<TbAd> pi = adService.findPage(ad, page, limit);
		result.setData(pi.getList());
		result.setCount(pi.getTotal());
		result.setSuccess(true);
		return result;
	}
	
}
