/**
 * @Project : libernary
 * @Package : com.alipay.tushu.biz.managers
 * @date 2014年10月18日 下午8:15:50
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.biz.managers.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.alipay.tushu.common.exceptions.BizException;
import com.alipay.tushu.common.exceptions.PrecondictionException;
import com.alipay.tushu.common.exceptions.SystemException;

/**
 * Manager层统一拦截器
 * 
 * @author yuanchen 2014年10月18日 下午8:15:50
 * @version
 */
public class CommonManagerInterceptor implements MethodInterceptor {

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
		} catch (SystemException e) {
		} catch (Throwable t) {
		}
		return null;
	}

}
