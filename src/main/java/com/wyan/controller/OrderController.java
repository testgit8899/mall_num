package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.PageResult;
import com.wyan.common.Result;
import com.wyan.pojo.TbOrder;
import com.wyan.service.OrderService;
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
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbOrder> findAll(){			
		return orderService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return orderService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param order
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbOrder order){
		try {
			orderService.add(order);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param order
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbOrder order){
		try {
			orderService.update(order);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param orderNo
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbOrder findOne(Long orderNo){
		return orderService.findOne(orderNo);		
	}
	
	/**
	 * 批量删除
	 * @param orderNos
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] orderNos){
		try {
			orderService.delete(orderNos);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param order
	 * @param page
	 * @param page
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search( TbOrder order, int page, int limit  ){
		PageResult pageResult = new PageResult();
		try {
			PageInfo pi = orderService.findPage(order,page,limit);

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
