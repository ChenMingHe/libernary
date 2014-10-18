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
	/** 错误码 */
	private ErrorCode errorCode;

	/** 结果信息 */
	private String resultMsg;

	// ~~ getter & setter
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
