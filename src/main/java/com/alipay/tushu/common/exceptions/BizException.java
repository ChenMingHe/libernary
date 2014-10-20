/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common.exceptions
 * @date 2014年10月18日 下午8:27:07
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.exceptions;

import com.alipay.tushu.common.errors.ErrorCode;

/**
 * 业务执行异常
 * 
 * @author yuanchen 2014年10月18日 下午8:27:07
 * @version
 */
public class BizException extends BaseException {
	private static final long	serialVersionUID	= -6341870722380599725L;

	public BizException() {
		super();
	}

	public BizException(ErrorCode errorCode, Throwable cause) {
		super(errorCode, cause);
	}

	public BizException(ErrorCode errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}
}
