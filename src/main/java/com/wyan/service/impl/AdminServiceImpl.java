package com.wyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyan.common.AgentPojo;
import com.wyan.common.CommonValue;
import com.wyan.mapper.TbAdminMapper;
import com.wyan.pojo.CountData;
import com.wyan.pojo.TbAdmin;
import com.wyan.pojo.TbAdminExample;
import com.wyan.pojo.TbAdminExample.Criteria;
import com.wyan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService,UserDetailsService {

	@Autowired
	private TbAdminMapper adminMapper;

	@Autowired
	private BCryptPasswordEncoder pwdEncoder;


	/**
	 * 查询全部
	 */
	@Override
	public List<TbAdmin> findAllSeller() {

		TbAdminExample example  = new TbAdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(CommonValue.AGENT_ROLE);
		criteria.andStateEqualTo(CommonValue.OK);
		return adminMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbAdmin> list=    adminMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAdmin admin) {
		admin.setPassword(pwdEncoder.encode(admin.getPassword()));
		String d = admin.getDomainAddress();
		admin.setState(CommonValue.OK);
		admin.setNetNum(d.substring(d.indexOf("protal/")+7,d.length()));
		adminMapper.insert(admin);
	}


	/**
	 * 修改
	 */
	@Override
	public void update(TbAdmin admin){
		if(admin.getPassword().length()>25){
			admin.setPassword(pwdEncoder.encode(admin.getPassword()));
		}
		admin.setState(CommonValue.OK);
		adminMapper.updateByPrimaryKey(admin);
	}

	/**
	 * 根据ID获取实体
	 * @param userid
	 * @return
	 */
	@Override
	public TbAdmin findOne(Integer userid){
		return adminMapper.selectByPrimaryKey(userid);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] userids) {
		for(Integer userid:userids){
			adminMapper.deleteByPrimaryKey(userid);
		}
	}


	@Override
	public PageInfo findPage(TbAdmin admin, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		TbAdminExample example=new TbAdminExample();
		Criteria criteria = example.createCriteria();

		if(admin!=null){
			if(admin.getUsername()!=null && admin.getUsername().length()>0){
				criteria.andUsernameLike("%"+admin.getUsername()+"%");
			}if(admin.getPassword()!=null && admin.getPassword().length()>0){
				criteria.andPasswordLike("%"+admin.getPassword()+"%");
			}if(admin.getRoleid()!=null && admin.getRoleid()>0){
				criteria.andRoleidEqualTo(admin.getRoleid());
			}if(admin.getPhonenum()!=null && admin.getPhonenum().length()>0){
				criteria.andPhonenumLike("%"+admin.getPhonenum()+"%");
			}if(admin.getRealname()!=null && admin.getRealname().length()>0){
				criteria.andRealnameLike("%"+admin.getRealname()+"%");
			}if(admin.getLang()!=null && admin.getLang().length()>0){
				criteria.andLangLike("%"+admin.getLang()+"%");
			}if(admin.getUseraccount()!=null && admin.getUseraccount().length()>0){
				criteria.andUseraccountLike("%"+admin.getUseraccount()+"%");
			}if(admin.getLinkqq()!=null && admin.getLinkqq().length()>0){
				criteria.andLinkqqLike("%"+admin.getLinkqq()+"%");
			}if(admin.getAddress()!=null && admin.getAddress().length()>0){
				criteria.andAddressLike("%"+admin.getAddress()+"%");
			}if(admin.getDomainAddress()!=null && admin.getDomainAddress().length()>0){
				criteria.andDomainAddressLike("%"+admin.getDomainAddress()+"%");
			}if(admin.getQrcode()!=null && admin.getQrcode().length()>0){
				criteria.andQrcodeLike("%"+admin.getQrcode()+"%");
			}if(admin.getCashcount()!=null && admin.getCashcount().length()>0){
				criteria.andCashcountLike("%"+admin.getCashcount()+"%");
			}if(admin.getCashname()!=null && admin.getCashname().length()>0){
				criteria.andCashnameLike("%"+admin.getCashname()+"%");
			}
		}
		List<TbAdmin> list= adminMapper.selectByExample(example);
		return new PageInfo(list);
	}
    @Override
    public PageInfo searchAgent(TbAdmin admin, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbAdminExample example=new TbAdminExample();
        Criteria criteria = example.createCriteria();

        if(admin!=null){
            if(admin.getRoleid()!=null && admin.getRoleid()>0){
                criteria.andRoleidEqualTo(admin.getRoleid());
            }if(admin.getPhonenum()!=null && admin.getPhonenum().length()>0){
                criteria.andPhonenumLike("%"+admin.getPhonenum()+"%");
            }if(admin.getRealname()!=null && admin.getRealname().length()>0){
                criteria.andRealnameLike("%"+admin.getRealname()+"%");
            }if(admin.getUseraccount()!=null && admin.getUseraccount().length()>0){
                criteria.andUseraccountEqualTo(admin.getUseraccount());
            }if(admin.getParentId()!=null){
            	criteria.andParentIdEqualTo(admin.getParentId());
			}if(admin.getState()!=null){
            	criteria.andStateEqualTo(admin.getState());
			}
        }
        List<TbAdmin> list= adminMapper.selectByExample(example);
        for(TbAdmin admin1 :list){
            TbAdmin parent = adminMapper.selectByPrimaryKey(admin1.getParentId());
            admin1.setParentName(parent.getRealname());
        }
        return new PageInfo(list);
    }
	@Override
	public TbAdmin findByName(String username) {
		TbAdminExample example = new TbAdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseraccountEqualTo(username);
		List<TbAdmin> tbAdmins = adminMapper.selectByExample(example);
		return tbAdmins.get(0);
	}

	@Override
	public void deleteById(Integer userid) {
		adminMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public void modifyUserState(Integer[] ids, Integer state) {
		for(Integer id:ids){
			TbAdmin admin = adminMapper.selectByPrimaryKey(id);
			if(null!=admin){
				admin.setState(state);
				adminMapper.updateByPrimaryKey(admin);
			}
		}
	}

	@Override
	public List<TbAdmin> findAll() {
		TbAdminExample example  = new TbAdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(CommonValue.OK);
		return adminMapper.selectByExample(example);
	}

	@Override
	public List<TbAdmin> findAllAgent() {
		TbAdminExample example  = new TbAdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(CommonValue.AGENT_ROLE);
		criteria.andStateEqualTo(CommonValue.OK);
		return adminMapper.selectByExample(example);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TbAdminExample example = new TbAdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseraccountEqualTo(username);
		criteria.andStateEqualTo(CommonValue.OK);
		List<TbAdmin> tbAdmins = adminMapper.selectByExample(example);
		if(null!=tbAdmins&&tbAdmins.size()==1){
			TbAdmin admin = tbAdmins.get(0);
			List<GrantedAuthority> authorities = new ArrayList<>();
			String role = "";
			if(admin.getRoleid()==CommonValue.ADMIN_ROLE){
				role="ROLE_ADMIN";
			}else if(admin.getRoleid()==CommonValue.AGENT_ROLE){
				role="ROLE_AGENT";
			}else if(admin.getRoleid()==CommonValue.USER_ROLE){
				role="ROLE_USER";
			}else{
				role="ROLE_SUPPLIER";
			}
			authorities.add(new SimpleGrantedAuthority(role));
			return new User(admin.getUseraccount(),admin.getPassword(),authorities);
		}
		return null;
	}
}
