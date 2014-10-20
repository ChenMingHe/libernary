/**
 * @Project : libernary
 * @Package : com.alipay.tushu.biz.managers.impl
 * @date 2014年10月19日 上午7:35:17
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.biz.managers.impl;

import com.alipay.tushu.biz.managers.BookCategoryManager;
import com.alipay.tushu.common.resps.CommonResp;
import com.alipay.tushu.core.model.BookCategory;
import com.alipay.tushu.utils.Precondiction;

/**
 * 
 * 
 * @author yuanchen 2014年10月19日 上午7:35:17
 * @version
 */
public class BookCategoryManagerImpl extends BaseManager implements BookCategoryManager {

	/*
	 * @see
	 * com.alipay.tushu.biz.managers.BookCategoryManager#create(com.alipay.tushu
	 * .core.model.BookCategory)
	 */
	public CommonResp<String> create(BookCategory bookCategory) {
		Precondiction.checkNotNull(bookCategory, BookCategory.class);
		String result = bookCategoryService.create(bookCategory);
		return new CommonResp<String>(result, true);
	}

}
