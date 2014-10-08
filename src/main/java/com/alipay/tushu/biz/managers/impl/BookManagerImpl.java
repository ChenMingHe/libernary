package com.alipay.tushu.biz.managers.impl;

import com.alipay.tushu.biz.managers.BookManager;
import com.alipay.tushu.core.services.BookService;

public class BookManagerImpl implements BookManager {
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

}
