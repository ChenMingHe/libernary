/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common.exceptions
 * @date 2014年10月18日 下午8:28:41
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.exceptions;

import com.alipay.tushu.common.errors.ErrorCode;

/**
 * 系统执行异常
 * 
 * @author yuanchen 2014年10月18日 下午8:28:41
 * @version
 */
public class SystemException extends BaseException {
	private static final long	serialVersionUID	= -2704119793729132318L;

	public SystemException() {
		super();
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(ErrorCode errorCode, Throwable cause) {
		super(errorCode, cause);
	}

	public SystemException(ErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
