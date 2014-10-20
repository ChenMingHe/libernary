/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common.exceptions
 * @date 2014年10月18日 下午8:32:06
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.exceptions;

import com.alipay.tushu.common.errors.ErrorCode;

/**
 * 异常基类
 * 
 * @author yuanchen 2014年10月18日 下午8:32:06
 * @version
 */
public class BaseException extends RuntimeException {
	/**  */
	private static final long	serialVersionUID	= 8264458521614803404L;

	/** 错误码 */
	private ErrorCode			errorCode;


	// ~~ Constructer
	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(ErrorCode errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
	}

	public BaseException(ErrorCode errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ \nErrorCode : [ ").append(errorCode.name()).append(", ").append(errorCode.getDesc())
		.append("]. \n").append(super.toString()).append("\n };");
		return sb.toString();
	}

	// ~~ getter & setter
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

}
