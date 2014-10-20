/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月14日 下午10:26:26
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * URL常量
 * 
 * @author yuanchen 2014年10月14日 下午10:26:26
 * @version
 */
public class URLConstants {
	/** 图书资源 */
	public final static String			BOOK			= "/books";

	/** 用户资源 */
	public final static String			USER			= "/users";

	/** 图书类目资源 */
	public final static String			BOOK_CATEGORY	= "/book_categorys";

	public final static String			CREATE			= "";
	public final static RequestMethod	CREATE_METHOD	= RequestMethod.POST;

	public final static String			LIST			= "";
	public final static RequestMethod	LIST_METHOD		= RequestMethod.GET;

	public final static String			EXISTS			= "";
	public final static RequestMethod	EXISTS_METHOD	= RequestMethod.GET;

	public final static String			EDIT			= "/edit";
	public final static RequestMethod	EDIT_METHOD		= RequestMethod.PUT;
}
