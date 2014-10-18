/**
 * tushu
 */
package com.alipay.tushu.core.services.impl;

import java.util.Date;

import com.alipay.tushu.core.converters.UserConverter;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.services.SequenceService.TableName;
import com.alipay.tushu.core.services.UserService;
import com.alipay.tushu.dal.dao.UserDAO;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月11日 下午11:40:34
 * @version
 */
public class UserServiceImpl extends BaseService implements UserService {

	/** UserDAO */
	private UserDAO userDAO;


	public String createUser(User user) {
		Date currentTime = getCurrentTime();
		String userId = getId(TableName.USER);
		UserDO userDO = UserConverter.convertBO2DO(user);
		userDO.setId(userId);
		userDO.setGmtCreate(currentTime);
		userDO.setGmtModified(currentTime);

		return userDAO.create(userDO);
	}

	// ~~ getter & setter
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
