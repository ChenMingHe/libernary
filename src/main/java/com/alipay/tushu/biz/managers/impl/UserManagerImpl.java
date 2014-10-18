package com.alipay.tushu.biz.managers.impl;


import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.core.model.User;

/**
 *  BookManager实现
 * 
 * @author yuanchen 2014年10月8日 下午10:37:56
 * @version
 */
public class UserManagerImpl extends BaseManager implements UserManager {

	/*
	 * @see com.alipay.tushu.biz.managers.UserManager#createUser(com.alipay.tushu.core.model.User)
	 */
	public String createUser(User user) {
		String result = userService.createUser(user);
		return result;
	}
}
