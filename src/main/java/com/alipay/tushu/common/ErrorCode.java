/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common
 * @date 2014年10月15日 下午8:38:52
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common;

/**
 * 
 * 
 * @author yuanchen 2014年10月15日 下午8:38:52
 * @version
 */
public enum ErrorCode {
	RESOURCE_NOT_FOUND("资源不存在"), 
	BIZ_ERROR("业务处理异常"),
	SYSTEM_ERROR("系统处理异常");

	/** 错误描述 */
	private String desc;

	// ~~ Constructer
	private ErrorCode(String desc) {
		this.desc = desc;
	}

	// ~~ getter & setter
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
