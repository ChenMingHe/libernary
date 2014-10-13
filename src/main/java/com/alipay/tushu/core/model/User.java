package com.alipay.tushu.core.model;

import java.util.Date;

import com.alipay.tushu.core.model.enums.UserTypeEnum;

/**
 * 用户领域模型
 * 
 * @author yuanchen
 * 
 */
public class User {

	/** 用户ID */
	private String id;
	/** 登录名 */
	private String loginName;
	/** 密钥 */
	private String password;
	/** 昵称 */
	private String name;
	/** 类型 */
	private UserTypeEnum type;
	/** 创建时间 */
	private Date gmtCreate;
	/** 修改时间 */
	private Date gmtModified;

	// ~~ getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserTypeEnum getType() {
		return type;
	}

	public void setType(UserTypeEnum type) {
		this.type = type;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		String s = "id, loginName, password, name, type, gmtCreate, gmtModified = " + id + loginName + password + name
				+ type + gmtCreate + gmtModified;
		return s;
	}
}
