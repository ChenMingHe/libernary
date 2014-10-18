/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common
 * @date 2014年10月15日 下午8:38:52
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.errors;

import org.apache.commons.lang.StringUtils;

/**
 * 错误码
 * 
 * @author yuanchen 2014年10月15日 下午8:38:52
 * @version
 */
public enum ErrorCode {
	PARAM_CHECK_ERROR("参数校验错误"),
	BIZ_ERROR("业务处理异常"),
	SYSTEM_ERROR("系统处理异常"),
	RESOURCE_NOT_FOUND("资源不存在"),
	;
	/** 错误描述 */
	private String desc;

	/**
	 * @Description: 根据名字获取错误枚举
	 * 
	 * @param name
	 * @return
	 * @throws
	 */
	public static ErrorCode getCodeByName(String name) {
		if (StringUtils.isEmpty(name)) {
			return null;
		}

		for (ErrorCode code : values()) {
			if (StringUtils.equals(code.name(), name)) {
				return code;
			}
		}

		return null;
	}

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
