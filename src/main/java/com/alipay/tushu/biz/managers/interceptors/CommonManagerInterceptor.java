/**
 * @Project : libernary
 * @Package : com.alipay.tushu.biz.managers
 * @date 2014年10月18日 下午8:15:50
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.biz.managers.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.tushu.common.errors.ErrorCode;
import com.alipay.tushu.common.errors.ErrorDescCache;
import com.alipay.tushu.common.exceptions.BizException;
import com.alipay.tushu.common.exceptions.PrecondictionException;
import com.alipay.tushu.common.exceptions.SystemException;
import com.alipay.tushu.common.resps.CommonResp;

/**
 * Manager层统一拦截器
 * 
 * @author yuanchen 2014年10月18日 下午8:15:50
 * @version
 */
public class CommonManagerInterceptor implements MethodInterceptor {

	/** 日志 */
	public final static Logger	logger	= LoggerFactory.getLogger(CommonManagerInterceptor.class);

	/*
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = doInvoke(invocation);
		return result;
	}

	public <T> Object doInvoke(MethodInvocation invocation) {
		// 统一异常处理，日志，参数检查
		try {
		} catch (PrecondictionException e) {
		} catch (BizException e) {
			String errorDesc = getErrorDesc(e.getErrorCode(), invocation.getMethod().getName());

			// 先默认打印级别为调试，如果需要在运行期记录，在外部打印其它级别
			logger.debug(errorDesc, e);

			return new CommonResp<T>(false, e.getErrorCode(), errorDesc);
		} catch (SystemException e) {
			String errorDesc = getErrorDesc(e.getErrorCode(), invocation.getMethod().getName());
			StringBuilder sb = null;
			if (StringUtils.isNotEmpty(e.getMessage())) {
				sb = new StringBuilder();
				sb.append("System Error : ").append(e.getMessage()).append(". \n").append(errorDesc);
			}

			logger.error(sb.toString(), e);

			return new CommonResp<T>(false, e.getErrorCode(), sb.toString());
		} catch (Throwable t) {
			logger.error(ErrorCode.SYSTEM_UNKNOW_ERROR.getDesc(), t);

			return new CommonResp<T>(false, ErrorCode.SYSTEM_UNKNOW_ERROR, ErrorCode.SYSTEM_UNKNOW_ERROR.getDesc());
		}
		return null;
	}

	/**
	 * @Description: 获取错误描述
	 * 
	 * @param errorCode
	 * @param scene
	 * @return
	 * @throws
	 */
	private String getErrorDesc(ErrorCode errorCode, String scene) {
		String errorDesc = null;
		if (errorCode == null) {
			errorDesc = "Error in call method : " + scene;
		} else {
			errorDesc = ErrorDescCache.getErrorDesc(scene, errorCode);
		}
		return errorDesc;
	}

}
