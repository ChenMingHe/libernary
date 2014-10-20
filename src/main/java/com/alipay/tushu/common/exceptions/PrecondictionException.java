/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common
 * @date 2014年10月18日 下午8:24:14
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.exceptions;

import com.alipay.tushu.common.errors.ErrorCode;

/**
 * 前置校验异常
 * 
 * @author yuanchen 2014年10月18日 下午8:24:14
 * @version
 */
public class PrecondictionException extends BaseException {
	private static final long	serialVersionUID	= 5907880441569097862L;

	public PrecondictionException() {
		super();
	}

	public PrecondictionException(String message) {
		super(message);
	}

	public PrecondictionException(String message, Throwable cause) {
		super(message, cause);
	}

	public PrecondictionException(ErrorCode errorCode, Throwable cause) {
		super(errorCode, cause);
	}

	public PrecondictionException(ErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
