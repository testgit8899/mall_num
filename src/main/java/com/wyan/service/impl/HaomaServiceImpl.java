package com.wyan.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.CommonValue;
import com.wyan.common.ImportThread;
import com.wyan.mapper.ProfitSetMapper;
import com.wyan.mapper.TbAdminMapper;
import com.wyan.mapper.TbHaomaMapper;
import com.wyan.pojo.*;
import com.wyan.pojo.TbHaomaExample.Criteria;
import com.wyan.service.HaomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HaomaServiceImpl implements HaomaService {

	@Autowired
	private TbHaomaMapper haomaMapper;

	@Autowired
	private TbAdminMapper adminMapper;

	@Autowired
	private ProfitSetMapper setMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbHaoma> findAll() {
		return haomaMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		List<TbHaoma> list=    haomaMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHaoma haoma) {
		if(haoma.getShare()==null||haoma.getShare()!=1){
			haoma.setShare(0);
		}
		if(haoma.getRecommonded()==null||haoma.getRecommonded()!=1){
			haoma.setRecommonded(0);
		}
		haoma.setHaoduan(haoma.getCellNum().substring(0,3));
		haomaMapper.insert(haoma);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHaoma haoma){
		TbHaoma dbhaoma = haomaMapper.selectByPrimaryKey(haoma.getId());
		if(haoma.getShare()==null||haoma.getShare()!=1){
			haoma.setShare(0);
		}
		if(haoma.getRecommonded()==null||haoma.getRecommonded()!=1){
			haoma.setRecommonded(0);
		}
		haoma.setHaoduan(haoma.getCellNum().substring(0,3));
		haoma.setSeller(dbhaoma.getSeller());
		haoma.setAgentPrice(0);
		haoma.setAgentId(dbhaoma.getAgentId());
		haoma.setStatus(dbhaoma.getStatus());
		haoma.setSelltime(dbhaoma.getSelltime());
		haoma.setAddtime(haoma.getAddtime());
		haoma.setProvinceName(haoma.getProvinceName().split(",")[1]);
		haoma.setCityName(haoma.getCityName().split(",")[1]);
		haomaMapper.updateByPrimaryKey(haoma);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbHaoma findOne(String id){
		return haomaMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			haomaMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbHaoma haoma, int pageNum, int pageSize) {
		TbHaomaExample example=new TbHaomaExample();
		Criteria criteria = example.createCriteria();

		//当前用户信息
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TbAdminExample example1 = new TbAdminExample();
		TbAdminExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andUseraccountEqualTo(username);
		criteria1.andStateEqualTo(CommonValue.OK);
		List<TbAdmin> tbAdmins = adminMapper.selectByExample(example1);
		TbAdmin admin = tbAdmins.get(0);
		PageHelper.startPage(pageNum, pageSize);
		if(haoma!=null){
			if(haoma.getCityName()!=null && haoma.getCityName().length()>0){
				String [] strs = haoma.getCityName().split(",");
				String cityName = strs[1];
				criteria.andCityNameEqualTo(cityName);
			}
			if(haoma.getShare()!=null){
				//查询共享
				if(haoma.getShare()==1){
					criteria.andShareEqualTo(haoma.getShare());
				}else{
					criteria.andAgentIdEqualTo(new Long(admin.getUserid()));
				}
			}
			if(haoma.getSeller()!=null && haoma.getSeller().length()>0){
				criteria.andSellerEqualTo(haoma.getSeller());
			}if(haoma.getWangluo()!=null && haoma.getWangluo().length()>0){
				criteria.andWaangluoLike("%"+haoma.getWangluo()+"%");
			}if(haoma.getInfomation()!=null && haoma.getInfomation().length()>0){
				criteria.andInfomationLike("%"+haoma.getInfomation()+"%");
			}if(haoma.getProvinceName()!=null && haoma.getProvinceName().length()>0){
				String [] strs = haoma.getProvinceName().split(",");
				String provinceName = strs[1];
				criteria.andProvinceNameEqualTo(provinceName);
			}if(haoma.getSellerBrand()!=null && haoma.getSellerBrand().length()>0){
				criteria.andSellerBrandLike("%"+haoma.getSellerBrand()+"%");
			}if(haoma.getStatus()!=null){
				criteria.andStatusEqualTo(haoma.getStatus());
			}if(haoma.getCellNum()!=null&& haoma.getCellNum().length()>0){
				criteria.andCellNumLike("%"+haoma.getCellNum());
			}
			if(haoma.getType()!=null&& haoma.getType().length()>0){
				criteria.andTypeEqualTo(haoma.getType());
			}
		}
		List<TbHaoma> list= haomaMapper.selectByExample(example);
		dynamicPrice(list,admin);
		return new PageInfo(list);
	}

	@Override
	public void saveList(List<TbHaoma> numList) {
		try {
			//一个线程处理200条数据
			int count = 200;
			//数据集合大小
			int listSize = numList.size();
			//开启的线程数
			int runSize = (listSize / count) + 1;
			//存放每个线程的执行数据
			List<TbHaoma> newlist = null;

			//创建一个线程池，数量和开启线程的数量一样
			//ThreadPoolExecutor的写法
			ThreadPoolExecutor executor = new ThreadPoolExecutor(runSize, runSize, 1,
					TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
					new ThreadPoolExecutor.DiscardOldestPolicy());
			//创建两个个计数器
			CountDownLatch begin = new CountDownLatch(1);
			CountDownLatch end = new CountDownLatch(runSize);
			//循环创建线程
			for (int i = 0; i < runSize; i++) {
				//计算每个线程执行的数据
				if ((i + 1) == runSize) {
					int startIndex = (i * count);
					int endIndex = numList.size();
					newlist = numList.subList(startIndex, endIndex);
				} else {
					int startIndex = (i * count);
					int endIndex = (i + 1) * count;
					newlist = numList.subList(startIndex, endIndex);
				}
				//线程类
				ImportThread mythead = new ImportThread(newlist, begin, end, haomaMapper);
				//这里执行线程的方式是调用线程池里的executor.execute(mythead)方法。
				executor.execute(mythead);
			}
			begin.countDown();
			end.await();
			//执行完关闭线程池
			executor.shutdown();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Long totalNum() {
		Long money =haomaMapper.totalNum();
		if(null==money){
			return 0l;
		}
		return money;
	}

	//处理号码种代理价钱的显示
	public void dynamicPrice(List<TbHaoma> list,TbAdmin admin){

		if(admin.getRoleid()!=CommonValue.ADMIN_ROLE){
			//获取用户 对应的等级
			Integer level = admin.getLevel();
			//获取级别对应的价钱 百分比
			List<ProfitSet> sets = setMapper.findAllProfitSet();
			//取出一级代理的利润增加比
			Integer profit1 = 0;
			//取出一级代理的利润增加比
			Integer profit2 = 0;
			//取出一级代理的利润增加比
			Integer profit3 = 0;
			for (ProfitSet set : sets) {
				if(set.getAgentLevel()==1){
					profit1=100-set.getProfitRadio();
				}
				if(set.getAgentLevel()==2){
					profit2=100-set.getProfitRadio();
				}
				if(set.getAgentLevel()==3){
					profit3=100-set.getProfitRadio();
				}
			}
			for(TbHaoma haoma :list){
				//判断级别 为供应商 或者一级代理上增加 底价 设置代理价
				if(level==0||level==1){
					if(haoma.getAgentId().intValue()!=admin.getUserid()){
						haoma.setPrice(haoma.getPrice()+haoma.getPrice()*profit1/100);
						haoma.setAgentPrice(haoma.getPrice()+haoma.getPrice()*(profit1+profit2)/100);
					}
				}else if(level==2){
					haoma.setPrice(haoma.getPrice()+haoma.getPrice()*(profit1+profit2)/100);
					haoma.setAgentPrice(haoma.getSalePrice());
				}else if(level==3){
					haoma.setPrice(haoma.getSalePrice());
					haoma.setAgentPrice(haoma.getSalePrice());
				}
			}
		}

	}
}
