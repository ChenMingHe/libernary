/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common.errors
 * @date 2014年10月19日 下午7:19:12
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common.errors;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author yuanchen 2014年10月19日 下午7:19:12
 * @version
 */
public class ErrorDesc {
	/** 存放错误文案 */
	private final static Map<String, String>	errorDesc	= new HashMap<String, String>();

	/**
	 * 初始化文案
	 * */
	static {
		addErrorMessage("", ErrorCode.RESOURCE_NOT_FOUND, "");
	}


		/**
	 * @Description: 获取文案
	 * 
	 * @param scene
	 * @param code
	 * @return
	 * @throws
	 */
	public static String getErrorDesc(String scene, ErrorCode code) {
		StringBuilder key = new StringBuilder();
		key.append(scene).append(code.name());
		return errorDesc.get(key);
	}

	/**
	 * @Description:
	 * 
	 * @param scene
	 * @param code
	 * @param desc
	 * @throws
	 */
	private static void addErrorMessage(String scene, ErrorCode code, String desc) {
		String key = scene + "|" + code.name();
		errorDesc.put(key, desc);
	}
}
