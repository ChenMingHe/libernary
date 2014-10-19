/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dao
 * @date 2014年10月18日 下午10:23:55
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dao;

import com.alipay.tushu.dal.dos.BookCategoryDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午10:23:55
 * @version
 */
public interface BookCategoryDAO {
	/**
	 * @Description: 创建
	 * 
	 * @param bookCategoryDO
	 * @return
	 * @throws
	 */
	String create(BookCategoryDO bookCategoryDO);
}
