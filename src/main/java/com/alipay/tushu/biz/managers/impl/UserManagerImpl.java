package com.alipay.tushu.biz.managers.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.core.converters.exceptions.CoreException;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.services.UserService;

/** 
*  BookManager实现
* 
* @author yuanchen 2014年10月8日 下午10:37:56 
* @version  
*/
public class UserManagerImpl implements UserManager {
	/** 
	* @Fields logger : 日志
	*/ 
	private Logger logger = LoggerFactory.getLogger(UserManagerImpl.class);
	
	/** 
	* @Fields userService  
	*/ 
	private UserService userService;

	/* 
	* @see com.alipay.tushu.biz.managers.UserManager#createUser(com.alipay.tushu.core.model.User) 
	*/
	public String createUser(User user) {
		try {
			String result = userService.createUser(user);
			return result;
		} catch (CoreException e) {
			logger.error("create user failed", e);
			return null;
		}
	}

	// ~~ getter && setter
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
