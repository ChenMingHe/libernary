/**
 * @Project : libernary
 * @Package : com.alipay.tushu.biz.managers
 * @date 2014年10月19日 上午7:35:05
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.biz.managers;

import com.alipay.tushu.common.resps.CommonResp;
import com.alipay.tushu.core.model.BookCategory;

/**
 * 
 * 
 * @author yuanchen 2014年10月19日 上午7:35:05
 * @version
 */
public interface BookCategoryManager {
	/**
	 * @Description: 创建新的图书类目
	 * 
	 * @param bookCategory
	 * @return
	 * @throws
	 */
	CommonResp<String> create(BookCategory bookCategory);
}
