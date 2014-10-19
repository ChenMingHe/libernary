/**
 * @Project : libernary
 * @Package : com.alipay.tushu.controller
 * @date 2014年10月19日 上午7:27:35
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alipay.tushu.common.resps.CommonResp;
import com.alipay.tushu.controller.dtos.BookCategoryDTO;
import com.alipay.tushu.core.converters.BookCategoryConverter;
import com.alipay.tushu.core.model.BookCategory;
import com.alipay.tushu.utils.CallBackHandler;
import com.alipay.tushu.utils.URLConstants;

/**
 * 图书类目管理
 * 
 * @author yuanchen 2014年10月19日 上午7:27:35
 * @version
 */
@Controller
@RequestMapping(value = URLConstants.BOOK_CATEGORY)
@SuppressWarnings("unchecked")
public class BookCategoryController extends BaseController {

	@RequestMapping(value = URLConstants.CREATE, method = RequestMethod.POST)
	public void create(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			final @RequestBody BookCategoryDTO bookCategoryDTO) {
		handleTemplate.process(request, response, model, new CallBackHandler() {

			@Override
			public CommonResp<String> handle() throws Exception {
				BookCategory bookCategory = BookCategoryConverter.dto2bo(bookCategoryDTO);
				return bookCategoryManager.create(bookCategory);
			}
		});
	}

	@RequestMapping(value = "/{categoryId}", method = RequestMethod.DELETE)
	public void delete(HttpServletRequest request, HttpServletResponse response, ModelMap model, String categoryId) {

	}

	@RequestMapping(value = "/move", method = RequestMethod.PUT)
	public void move(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

	}

	@RequestMapping(value = URLConstants.EDIT, method = RequestMethod.PUT)
	public void edit(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

	}

	@RequestMapping(value = "/roots/{libernaryId}", method = RequestMethod.GET)
	public void findAllRootCategory(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			String libernaryId) {

	}

	@RequestMapping(value = "/sub/{libernaryId}", method = RequestMethod.GET)
	public void findSubCategory(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			String categoryId) {

	}

	@RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
	public void getById(HttpServletRequest request, HttpServletResponse response, ModelMap model, String categoryId) {

	}

	@RequestMapping(value = URLConstants.EXISTS, method = RequestMethod.GET)
	public void exists(HttpServletRequest request, HttpServletResponse response, ModelMap model, String categoryName) {
		handleTemplate.process(request, response, model, new CallBackHandler() {

			@Override
			public CommonResp<Boolean> handle() throws Exception {
				return null;
			}
		});
	}
}
