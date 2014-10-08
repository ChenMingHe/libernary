package com.alipay.tushu.core.model.enums;

public enum UserTypeEnum {
	STUDENT(1, "学生"), TEACHER(2, "教师"), ;

	/** 状态码 */
	private int code;
	/** 描述 */
	private String desc;

	private UserTypeEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	/**
	 * 根据码获取枚举
	 * 
	 * @param code
	 * @return
	 */
	public static UserTypeEnum getEnumbyCode(int code) {

		for (UserTypeEnum value : values()) {
			if (value.getCode() == code) {
				return value;
			}
		}

		return null;
	}

	// ~~ getter & setter
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
