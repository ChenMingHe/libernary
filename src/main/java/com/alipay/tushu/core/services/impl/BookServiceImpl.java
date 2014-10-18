package com.alipay.tushu.core.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alipay.tushu.core.model.Book;
import com.alipay.tushu.core.services.BookService;
import com.alipay.tushu.dal.dao.BookDAO;

@Service
public class BookServiceImpl extends BaseService implements BookService {

	private BookDAO bookDAO;

	public List<Book> findAll() {
		return null;
	}

	public String createBook(Book book) {
		return null;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
}
