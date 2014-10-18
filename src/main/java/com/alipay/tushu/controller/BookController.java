package com.alipay.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alipay.tushu.common.resps.CommonResp;
import com.alipay.tushu.core.model.Book;
import com.alipay.tushu.utils.CallBackHandler;
import com.alipay.tushu.utils.HandleTemplate;
import com.alipay.tushu.utils.URLConstants;

@Controller
@SuppressWarnings("unchecked")
@RequestMapping(URLConstants.BOOK)
public class BookController {
	/** 统一处理模板 */
	private HandleTemplate handleTemplate;

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	public void findBooks(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			@PathVariable String bookId) {
		handleTemplate.process(request, response, model, new CallBackHandler() {
			@Override
			public CommonResp<Book> handle() throws Exception {
				Book book = new Book();
				book.setName("编译原理");
				return new CommonResp<Book>(book, true);
			}
		});
	}

	// ~~ getter & setter
	public void setHandleTemplate(HandleTemplate handleTemplate) {
		this.handleTemplate = handleTemplate;
	}

}
