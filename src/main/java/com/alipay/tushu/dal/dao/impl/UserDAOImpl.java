/**
 * tushu
 */
package com.alipay.tushu.dal.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alipay.tushu.dal.dao.UserDAO;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月11日 下午11:42:37
 * @version
 */
public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO {

	/*
	 * @see
	 * com.alipay.tushu.dal.dao.UserDAO#create(com.alipay.tushu.dal.dos.UserDO)
	 */
	public String create(UserDO user) {
		if (user == null) {
			throw new IllegalArgumentException(
					"ERROR ## Can't not insert null value into db.");
		}

		getSqlMapClientTemplate().insert("TS-USER-INSERT", user);
		return user.getId();
	}

}
