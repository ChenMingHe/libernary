package com.alipay.tushu.biz.managers.impl;

import com.alipay.tushu.biz.managers.BookManager;
import com.alipay.tushu.core.services.BookService;

/** 
* BookManager实现
* 
* @author yuanchen 2014年10月8日 下午10:36:43 
* @version  
*/
public class BookManagerImpl implements BookManager {
	/** 
	* @Fields bookService : 
	*/ 
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

}
