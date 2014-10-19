/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.services.impl
 * @date 2014年10月19日 下午8:55:10
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.services.impl;

import java.util.Date;

import com.alipay.tushu.core.converters.BookCategoryConverter;
import com.alipay.tushu.core.model.BookCategory;
import com.alipay.tushu.core.services.BookCategoryService;
import com.alipay.tushu.core.services.SequenceService.TableName;
import com.alipay.tushu.dal.dos.BookCategoryDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月19日 下午8:55:10
 * @version
 */
public class BookCategoryServiceImpl extends BaseService implements BookCategoryService {

	/*
	 * @see
	 * com.alipay.tushu.core.services.BookCategoryService#create(com.alipay.
	 * tushu.core.model.BookCategory)
	 */
	public String create(BookCategory bookCategory) {
		BookCategoryDO bookCategoryDO = BookCategoryConverter.bo2do(bookCategory);

		String bookCategoryId = getId(TableName.BOOK_CATEGORY);
		Date currentTime = getCurrentTime();
		bookCategoryDO.setId(bookCategoryId);
		bookCategoryDO.setGmtCreate(currentTime);
		bookCategoryDO.setGmtModified(currentTime);

		return null;
	}

}
