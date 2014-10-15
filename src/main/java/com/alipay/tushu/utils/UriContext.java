/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月9日 下午10:44:20
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

/**
 * 网址上下文
 * 
 * @author yuanchen 2014年10月9日 下午10:44:20
 * @version
 */
public class UriContext {
	/** 主页域名 */
	private final String hostName = "http://localhost:8080";

	/** 主域 */
	private final String domain = "/libernary";

	/** 图书域 */
	private final String bookDomain = "/books";

	/** 用户域 */
	private final String userDomain = "/users";

	// ~~ getter & setter
	public String getHostName() {
		return hostName;
	}

	public String getBookDomain() {
		StringBuilder sb = new StringBuilder();
		sb.append(hostName).append(domain).append(bookDomain);
		return sb.toString();
	}

	public String getUserDomain() {
		StringBuilder sb = new StringBuilder();
		sb.append(hostName).append(domain).append(userDomain);
		return sb.toString();
	}
}
