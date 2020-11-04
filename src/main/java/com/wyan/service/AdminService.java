package com.wyan.service;

import com.github.pagehelper.PageInfo;
import com.wyan.pojo.CountData;
import com.wyan.pojo.TbAdmin;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AdminService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbAdmin> findAllSeller();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbAdmin admin);


	/**
	 * 修改
	 */
	public void update(TbAdmin admin);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbAdmin findOne(Integer userid);


	/**
	 * 批量删除
	 * @param userids
	 */
	public void delete(Integer[] userids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbAdmin admin, int pageNum, int pageSize);

    public PageInfo searchAgent(TbAdmin admin, int pageNum, int pageSize);

    TbAdmin findByName(String username);

	void deleteById(Integer userid);

    void modifyUserState(Integer[] ids, Integer state);

	List<TbAdmin> findAll();

	List<TbAdmin> findAllAgent();

}
