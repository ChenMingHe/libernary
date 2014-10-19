/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.services.impl
 * @date 2014年10月18日 下午9:56:59
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.services.impl;

import java.util.Date;

import com.alipay.tushu.core.services.SequenceService;
import com.alipay.tushu.core.services.SequenceService.TableName;
import com.alipay.tushu.dal.dao.BookCategoryDAO;
import com.alipay.tushu.dal.dao.BookDAO;
import com.alipay.tushu.dal.dao.BookItemDAO;
import com.alipay.tushu.dal.dao.BookOrderDAO;
import com.alipay.tushu.dal.dao.BookStoreDAO;
import com.alipay.tushu.dal.dao.InterestGroupDAO;
import com.alipay.tushu.dal.dao.LibernaryDAO;
import com.alipay.tushu.dal.dao.UserInterestGroupDAO;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午9:56:59
 * @version
 */
public class BaseService {
	/** 序列化服务 */
	private SequenceService			sequenceService;

	/**  */
	protected BookCategoryDAO		bookCategoryDAO;
	/**  */
	protected BookDAO				bookDAO;
	/**  */
	protected BookItemDAO			bookItemDAO;
	/**  */
	protected BookOrderDAO			bookOrderDAO;
	/**  */
	protected BookStoreDAO			bookStoreDAO;
	/**  */
	protected InterestGroupDAO		interestGroupDAO;
	/**  */
	protected LibernaryDAO			libernaryDAO;
	/**  */
	protected UserInterestGroupDAO	userInterestGroupDAO;

	/**
	 * @Description: 获取当前时间
	 * 
	 * @return
	 * @throws
	 */
	public Date getCurrentTime() {
		return sequenceService.genernateSystemTime();
	}

	/**
	 * @Description: 获取ID
	 * 
	 * @param table
	 * @return
	 * @throws
	 */
	public String getId(TableName table) {
		return sequenceService.genernate(table);
	}

	// ~~ getter & setter
	public void setSequenceService(SequenceService sequenceService) {
		this.sequenceService = sequenceService;
	}

	public void setBookCategoryDAO(BookCategoryDAO bookCategoryDAO) {
		this.bookCategoryDAO = bookCategoryDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public void setBookItemDAO(BookItemDAO bookItemDAO) {
		this.bookItemDAO = bookItemDAO;
	}

	public void setBookOrderDAO(BookOrderDAO bookOrderDAO) {
		this.bookOrderDAO = bookOrderDAO;
	}

	public void setBookStoreDAO(BookStoreDAO bookStoreDAO) {
		this.bookStoreDAO = bookStoreDAO;
	}

	public void setInterestGroupDAO(InterestGroupDAO interestGroupDAO) {
		this.interestGroupDAO = interestGroupDAO;
	}

	public void setLibernaryDAO(LibernaryDAO libernaryDAO) {
		this.libernaryDAO = libernaryDAO;
	}

	public void setUserInterestGroupDAO(UserInterestGroupDAO userInterestGroupDAO) {
		this.userInterestGroupDAO = userInterestGroupDAO;
	}

}
