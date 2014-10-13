/**
 * tushu
 */
package com.alipay.tushu.dal.dos;

import java.util.Date;

/**
 * UserDO
 * 
 * @author yuanchen 2014年10月11日 下午11:44:22
 * @version
 */
public class UserDO {

	/** 用户ID */
	private String id;
	/** 登录名 */
	private String loginName;
	/** 密钥 */
	private String password;
	/** 昵称 */
	private String name;
	/** 类型 */
	private String type;
	/** 创建时间 */
	private Date gmtCreate;
	/** 修改时间 */
	private Date gmtModified;

	// ~~ getter & setter

	@Override
	public String toString() {
		String s = "id, loginName, password, name, type, gmtCreate, gmtModified = " + id + loginName + password + name
				+ type + gmtCreate + gmtModified;
		return s;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

}
