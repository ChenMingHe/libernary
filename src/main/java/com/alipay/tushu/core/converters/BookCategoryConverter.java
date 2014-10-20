/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.converters
 * @date 2014年10月19日 下午8:56:51
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.converters;

import org.springframework.beans.BeanUtils;

import com.alipay.tushu.controller.dtos.BookCategoryDTO;
import com.alipay.tushu.core.model.BookCategory;
import com.alipay.tushu.dal.dos.BookCategoryDO;

/**
 * 转换
 * 
 * @author yuanchen 2014年10月19日 下午8:56:51
 * @version
 */
public class BookCategoryConverter {

	private static final String[]	IGNORE_PARAM	= new String[] { "parent" };

	public static BookCategoryDO bo2do(BookCategory bookCategory) {
		if (bookCategory == null) {
			return null;
		}

		BookCategoryDO bookCategoryDO = new BookCategoryDO();
		BeanUtils.copyProperties(bookCategory, bookCategoryDO, IGNORE_PARAM);
		if (bookCategory.getParent() != null) {
			bookCategoryDO.setParentId(bookCategory.getParent().getId());
		}

		return bookCategoryDO;
	}

	public static BookCategory dto2bo(BookCategoryDTO bookCategoryDTO) {
		BookCategory bookCategory = new BookCategory();

		BeanUtils.copyProperties(bookCategoryDTO, bookCategory, IGNORE_PARAM);

		if (bookCategoryDTO.getParent() != null) {
			bookCategory.setParent(dto2bo(bookCategoryDTO.getParent()));
		}

		return bookCategory;
	}
}
