package com.wyan.controller;

import com.github.pagehelper.PageInfo;
import com.wyan.common.Result;
import com.wyan.pojo.TbAttachmentIndex;
import com.wyan.service.AttachmentIndexService;
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
@RequestMapping("/attachmentIndex")
public class AttachmentIndexController {

	@Autowired
	private AttachmentIndexService attachmentIndexService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAttachmentIndex> findAll(){			
		return attachmentIndexService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo  findPage(int pageNum,int pageSize){
		return attachmentIndexService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param attachmentIndex
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbAttachmentIndex attachmentIndex){
		try {
			attachmentIndexService.add(attachmentIndex);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
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
	public PageInfo search(@RequestBody TbAttachmentIndex attachmentIndex, int pageNum, int pageSize  ){
		return attachmentIndexService.findPage(attachmentIndex, pageNum, pageSize);
	}
	
}
