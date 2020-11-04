package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.DateUtil;
import com.wyan.mapper.TbCustomRecyleMapper;
import com.wyan.pojo.TbCustomRecyle;
import com.wyan.pojo.TbCustomRecyleExample;
import com.wyan.pojo.TbCustomRecyleExample.Criteria;
import com.wyan.service.CustomRecyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CustomRecyleServiceImpl implements CustomRecyleService {

	@Autowired
	private TbCustomRecyleMapper customRecyleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCustomRecyle> findAll() {
		return customRecyleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbCustomRecyle> list=    customRecyleMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCustomRecyle customRecyle) {
		customRecyleMapper.insert(customRecyle);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCustomRecyle customRecyle){
		customRecyleMapper.updateByPrimaryKey(customRecyle);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCustomRecyle findOne(Integer id){
		return customRecyleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			customRecyleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbCustomRecyle customRecyle, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCustomRecyleExample example=new TbCustomRecyleExample();
		Criteria criteria = example.createCriteria();
		
		if(customRecyle!=null){			
			if(customRecyle.getHaoma()!=null && customRecyle.getHaoma().length()>0){
				criteria.andHaomaLike("%"+customRecyle.getHaoma()+"%");
			}
			if(customRecyle.getType()!=null){
				criteria.andTypeEqualTo(customRecyle.getType());
			}
		}
		List<TbCustomRecyle> list= customRecyleMapper.selectByExample(example);
		return new PageInfo(list);
	}

	//管理员查询昨日所有定制订单
	@Override
	public Long findCustomOrder() {
		Map map = new HashMap();
		String dateStr = DateUtil.fomartYearsTody();
		String dateStr2  = DateUtil.fomartToday();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
		Long customOrder = customRecyleMapper.findCustomOrder(map);
		if(null==customOrder){
			return 0l;
		}
		return customOrder;
	}

	@Override
	public Long findRecyleOrder() {
		Map map = new HashMap();
		String dateStr = DateUtil.fomartYearsTody();
		String dateStr2  = DateUtil.fomartToday();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
		Long recyleOrder = customRecyleMapper.findRecyleOrder(map);
		if(null==recyleOrder){
			return 0l;
		}
		return recyleOrder;
	}

	@Override
	public Long findTotalCustomOrder() {
		Map map = new HashMap();
		Long customOrder = customRecyleMapper.findCustomOrder(map);
		if(null==customOrder){
			return 0l;
		}
		return customOrder;
	}
	@Override
	public Long totalRecyleOrder() {
		Map map = new HashMap();
		Long recyleOrder = customRecyleMapper.findRecyleOrder(map);
		if(null==recyleOrder){
			return 0l;
		}
		return recyleOrder;
	}

}
