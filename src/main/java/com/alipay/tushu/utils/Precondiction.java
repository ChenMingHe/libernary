/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月18日 下午8:22:51
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import com.alipay.tushu.common.exceptions.PrecondictionException;

/**
 * 前置参数校验器
 * 
 * @author yuanchen 2014年10月18日 下午8:22:51
 * @version
 */
public class Precondiction {

	public static void checkNotNull(Object o, Class<?> c) {
		if (o == null) {
			throw new PrecondictionException("");
		}
	}

	public static void checkNotEmpty(String str) {
		if (StringUtils.isNotEmpty(str)) {
			throw new PrecondictionException("");
		}
	}

	@SuppressWarnings("rawtypes")
	public static void checkNotEmpty(Collection c) {
		if (CollectionUtils.isEmpty(c)) {
			throw new PrecondictionException("");
		}
	}


	public static void checkNotBlank(String str) {
		if (StringUtils.isNotBlank(str)) {
			throw new PrecondictionException("");
		}
	}


}
