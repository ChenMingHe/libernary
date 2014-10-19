/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dao.impl
 * @date 2014年10月18日 下午10:24:55
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alipay.tushu.common.exceptions.SystemException;
import com.alipay.tushu.dal.dao.BookCategoryDAO;
import com.alipay.tushu.dal.dos.BookCategoryDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午10:24:55
 * @version
 */
public class BookCategoryDAOImpl extends SqlMapClientDaoSupport implements BookCategoryDAO {

	/*
	 * @see
	 * com.alipay.tushu.dal.dao.BookCategoryDAO#create(com.alipay.tushu.dal.
	 * dos.BookCategoryDO)
	 */
	public String create(BookCategoryDO bookCategoryDO) {
		if (bookCategoryDO == null) {
			throw new SystemException("ERROR ## Can't not insert null value into db.");
		}

		getSqlMapClientTemplate().insert("TS-BOOK-CATEGORY-DELETE-BY-ID", bookCategoryDO);
		return bookCategoryDO.getId();
	}

}
