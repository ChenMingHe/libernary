package com.alipay.tushu.core.model.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 用户类型枚举
 * 
 * @author yuanchen 2014年10月12日 下午8:04:43
 * @version
 */
public enum UserTypeEnum {
	STUDENT("学生"), TEACHER("教师"), ;

	/** 描述 */
	private String desc;

	private UserTypeEnum(String desc) {
		this.desc = desc;
	}

	/**
	 * 获取枚举
	 * 
	 * @param code
	 * @return
	 */
	public static UserTypeEnum getbyName(String name) {
		if (StringUtils.isEmpty(name)) {
			return null;
		}

		for (UserTypeEnum value : values()) {
			if (StringUtils.equals(value.name(), name)) {
				return value;
			}
		}

		return null;
	}

	// ~~ getter & setter
	public String getDesc() {
		return desc;
	}
}
