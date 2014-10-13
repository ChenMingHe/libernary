/**
 * tushu
 */
package com.alipay.tushu.dal.dao;

import org.springframework.dao.DataAccessException;

import com.alipay.tushu.dal.dos.UserDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月13日 上午8:16:24
 * @version
 */
public interface UserDAO {
	/**
	 * @Description: 创建一个用户
	 * 
	 * @param user
	 * @return
	 * @throws DataAccessException
	 * @throws
	 */
	String create(UserDO user) throws DataAccessException;
}
