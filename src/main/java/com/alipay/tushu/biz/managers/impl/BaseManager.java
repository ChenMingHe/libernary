/**
 * @Project : libernary
 * @Package : com.alipay.tushu.biz.managers.impl
 * @date 2014年10月18日 下午10:31:49
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.biz.managers.impl;

import org.springframework.transaction.support.TransactionTemplate;

import com.alipay.tushu.core.services.BookCategoryService;
import com.alipay.tushu.core.services.BookService;
import com.alipay.tushu.core.services.UserService;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午10:31:49
 * @version
 */
public class BaseManager {
	/** 事务模板 */
	protected TransactionTemplate	transactionTemplate;

	protected BookService			bookService;

	protected UserService			userService;

	protected BookCategoryService	bookCategoryService;


	// ~~ getter & setter
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setBookCategoryService(BookCategoryService bookCategoryService) {
		this.bookCategoryService = bookCategoryService;
	}

}
