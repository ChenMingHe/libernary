/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.model.enums
 * @date 2014年10月18日 下午9:09:35
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.model.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 用户类型
 * 
 * @author yuanchen 2014年10月18日 下午9:09:35
 * @version
 */
public enum UserStatusEnum {
	FROZEN("冻结"),
	NORMAL("正常"),
	;

	/** 描述 */
	private String desc;

	/**
	 * @Description:
	 * 
	 * @param name
	 * @return
	 * @throws
	 */
	public static UserStatusEnum getStatusByName(String name) {
		if (StringUtils.isEmpty(name)) {
			return null;
		}

		for (UserStatusEnum status : values()) {
			if (StringUtils.equals(status.name(), name)) {
				return status;
			}
		}

		return null;
	}

	// ~~ Constructer
	private UserStatusEnum(String desc) {
		this.desc = desc;
	}

	// ~~ getter & setter
	public String getDesc() {
		return desc;
	}
}
