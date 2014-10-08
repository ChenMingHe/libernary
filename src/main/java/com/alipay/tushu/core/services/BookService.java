package com.alipay.tushu.core.services;

import java.util.List;

import com.alipay.tushu.core.model.Book;

public interface BookService {

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<Book> findAll();

	/**
	 * 创建一本图书
	 * 
	 * @param book
	 * @return
	 */
	String createBook(Book book);

}
