package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.DateUtil;
import com.wyan.mapper.TbOrderMapper;
import com.wyan.pojo.TbOrder;
import com.wyan.pojo.TbOrderExample;
import com.wyan.pojo.TbOrderExample.Criteria;
import com.wyan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TbOrderMapper orderMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbOrder> findAll() {
		return orderMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbOrder> list=    orderMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbOrder order) {
		orderMapper.insert(order);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbOrder order){
		orderMapper.updateByPrimaryKey(order);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param orderNo
	 * @return
	 */
	@Override
	public TbOrder findOne(Long orderNo){
		return orderMapper.selectByPrimaryKey(orderNo);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] orderNos) {
		for(Long orderNo:orderNos){
			orderMapper.deleteByPrimaryKey(orderNo);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbOrder order, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbOrderExample example=new TbOrderExample();
		Criteria criteria = example.createCriteria();
		
		if(order!=null){			
						if(order.getHaoma()!=null && order.getHaoma().length()>0){
				criteria.andHaomaLike("%"+order.getHaoma()+"%");
			}			if(order.getSeller()!=null && order.getSeller().length()>0){
				criteria.andSellerLike("%"+order.getSeller()+"%");
			}			if(order.getAgent()!=null && order.getAgent().length()>0){
				criteria.andAgentLike("%"+order.getAgent()+"%");
			}			if(order.getUsername()!=null && order.getUsername().length()>0){
				criteria.andUsernameLike("%"+order.getUsername()+"%");
			}			if(order.getSellerbrand()!=null && order.getSellerbrand().length()>0){
				criteria.andSellerbrandLike("%"+order.getSellerbrand()+"%");
			}			if(order.getWangluo()!=null && order.getWangluo().length()>0){
				criteria.andWangluoLike("%"+order.getWangluo()+"%");
			}
			if(order.getStatus()!=null){
				criteria.andStatusEqualTo(order.getStatus());
			}
		}
		
		List<TbOrder> list= orderMapper.selectByExample(example);
		return new PageInfo(list);
	}

	@Override
	public Long findHaomaOrder() {
		Map map = new HashMap();
		String dateStr = DateUtil.fomartYearsTody();
		String dateStr2  = DateUtil.fomartToday();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
        Long order = orderMapper.findHaomaOrder(map);
        if(null==order){
            return 0l;
        }
		return order;
	}

	@Override
	public Long findMonthReviceMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.getMonthStart();
		String dateStr2  = DateUtil.getMonthEnd();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
        Long order = orderMapper.findMonthReviceMoney(map);
        if(null==order){
            return 0l;
        }
        return order;
	}

	@Override
	public Long findReviceMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.fomartYearsTody();
		String dateStr2  = DateUtil.fomartToday();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
        Long order = orderMapper.findMonthReviceMoney(map);
        if(null==order){
            return 0l;
        }
        return order;
	}
	@Override
	public Long totalNum() {
		Map map = new HashMap();
        Long order = orderMapper.findHaomaOrder(map);
        if(null==order){
            return 0l;
        }
        return order;
	}

	@Override
	public Long totalReviceMoney() {
		Map map = new HashMap();
        Long order = orderMapper.findMonthReviceMoney(map);
        if(null==order){
            return 0l;
        }
        return order;
	}

	@Override
	public Long yearReceiveMoney() {
		Map map = new HashMap();
		String dateStr = DateUtil.getYearStart();
		String dateStr2  = DateUtil.getYearEnd();
		map.put("startTime",dateStr);
		map.put("endTime",dateStr2);
        Long order = orderMapper.findMonthReviceMoney(map);
        if(null==order){
            return 0l;
        }
        return order;
	}
}
