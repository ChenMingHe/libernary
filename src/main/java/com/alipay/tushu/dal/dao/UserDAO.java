/** 
 * tushu
 */
package com.alipay.tushu.dal.dao;

import org.springframework.dao.DataAccessException;

import com.alipay.tushu.dal.dos.UserDO;

/**
 * @author yuanchen
 * 
 */
public interface UserDAO {
	/**
	 * 创建一个用户
	 * 
	 * @param user
	 * @return
	 */
	String create(UserDO user) throws DataAccessException;
}
