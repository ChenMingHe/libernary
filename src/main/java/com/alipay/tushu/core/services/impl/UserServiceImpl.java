/**
 * tushu
 */
package com.alipay.tushu.core.services.impl;

import org.springframework.transaction.support.TransactionTemplate;

import com.alipay.tushu.core.converters.UserConverter;
import com.alipay.tushu.core.converters.exceptions.CoreException;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.services.UserService;
import com.alipay.tushu.dal.dao.UserDAO;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月11日 下午11:40:34
 * @version
 */
public class UserServiceImpl implements UserService {

	/**
	 * @Fields userDAO :
	 */
	private UserDAO userDAO;

	/**
	 * @Fields transactionTemplate : 事务模板
	 */
	private TransactionTemplate transactionTemplate;

	public String createUser(User user) throws CoreException {
		if (user == null) {
			throw new CoreException();
		}

		UserDO userDO = UserConverter.convertBO2DO(user);

		return userDAO.create(userDO);
	}

	// ~~ getter & setter
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
}
