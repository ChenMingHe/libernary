/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.model.enums
 * @date 2014年10月18日 下午9:15:29
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.model.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 图书实例状态枚举
 * 
 * @author yuanchen 2014年10月18日 下午9:15:29
 * @version
 */
public enum BookItemStatusEnum {
	BORROWD("被借阅"),
	FREE("可借阅"),
	;

	/**  */
	private String desc;

	/**
	 * @Description: 获取
	 * 
	 * @param name
	 * @return
	 * @throws
	 */
	public static BookItemStatusEnum getStatusByName(String name) {
		if (StringUtils.isEmpty(name)) {
			return null;
		}

		for (BookItemStatusEnum status : values()) {
			if (StringUtils.equals(status.name(), name)) {
				return status;
			}
		}

		return null;
	}

	// ~~ Constructer
	private BookItemStatusEnum(String desc) {
		this.desc = desc;
	}

	// ~~ getter & setter
	public String getDesc() {
		return desc;
	}
}
