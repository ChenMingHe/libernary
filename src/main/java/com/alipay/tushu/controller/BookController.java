package com.alipay.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

	private static final String BOOK_LIST = "bookList.vm";

	@RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
	public String findBooks(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			@PathVariable String bookId) {
		System.out.println(bookId);
		return BOOK_LIST;
	}

}
