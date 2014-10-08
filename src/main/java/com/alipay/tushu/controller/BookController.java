package com.alipay.tushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

	private static final String BOOK_LIST = "bookList.vm";

	@RequestMapping(value = "/books/all.htm", method = RequestMethod.GET)
	public String findBooks(ModelMap model) {
		return BOOK_LIST;
	}

}
