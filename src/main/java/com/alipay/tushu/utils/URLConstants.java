/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月14日 下午10:26:26
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 
 * @author yuanchen 2014年10月14日 下午10:26:26
 * @version
 */
public class URLConstants {
	/** 图书资源 */
	public final static String BOOK = "/books";

	public final static String USER = "/users";

	public final static String CREATE = "/create";
	public final static RequestMethod CREATE_METHOD = RequestMethod.POST;

	public final static String LIST = "";
	public final static RequestMethod LIST_METHOD = RequestMethod.GET;

}
