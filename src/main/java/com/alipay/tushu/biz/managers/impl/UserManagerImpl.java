/** 
 * tushu
 */
package com.alipay.tushu.biz.managers.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.core.converters.exceptions.CoreException;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.services.UserService;

/**
 * @author yuanchen
 * 
 */
public class UserManagerImpl implements UserManager {
	private Logger logger = LoggerFactory.getLogger(UserManagerImpl.class);
	
	private UserService userService;

	// @see com.alipay.tushu.biz.managers.UserManager#createUser()
	public String createUser(User user) {
		try {
			String result = userService.createUser(user);
			return result;
		} catch (CoreException e) {
			logger.error("create user failed", e);
			return null;
		}
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
