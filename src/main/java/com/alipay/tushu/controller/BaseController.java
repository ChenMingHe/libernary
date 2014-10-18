/**
 * @Project : libernary
 * @Package : com.alipay.tushu.controller
 * @date 2014年10月18日 下午11:10:16
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.controller;

import com.alipay.tushu.biz.managers.BookManager;
import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.utils.HandleTemplate;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午11:10:16
 * @version
 */
public class BaseController {
	/** 统一处理模板 */
	protected HandleTemplate handleTemplate;

	protected UserManager userManager;
	protected BookManager bookManager;

	// ~~ getter & setter
	public void setHandleTemplate(HandleTemplate handleTemplate) {
		this.handleTemplate = handleTemplate;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}

}
