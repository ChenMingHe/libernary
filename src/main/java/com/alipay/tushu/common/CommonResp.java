/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common
 * @date 2014年10月15日 下午8:37:41
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common;

/**
 * 通用返回对象定义
 * 
 * @author yuanchen 2014年10月15日 下午8:37:41
 * @version
 */
public class CommonResp<T> {
	/** 是否成功 */
	private boolean success = false;

	/** 错误码 */
	private ErrorCode errorCode;

	/** 结果信息 */
	private String resultMsg;

	/** 返回对象 */
	private T target;

	// ~~ Constructer
	CommonResp() {

	}

	public CommonResp(boolean success) {
		this.success = success;
	}

	public CommonResp(boolean success, ErrorCode errorCode) {
		this.success = success;
		this.errorCode = errorCode;
	}

	public CommonResp(boolean success, ErrorCode errorCode, String resulMsg) {
		this.success = success;
		this.errorCode = errorCode;
		this.resultMsg = resulMsg;
	}

	public CommonResp(T target, boolean success) {
		this.target = target;
		this.success = success;
	}

	public CommonResp(T target, boolean success, String resultMsg) {
		this.target = target;
		this.success = success;
		this.resultMsg = resultMsg;
	}

	// ~~ getter & setter
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

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

	public T getTarget() {
		return target;
	}

	public void setTarget(T target) {
		this.target = target;
	}

}
