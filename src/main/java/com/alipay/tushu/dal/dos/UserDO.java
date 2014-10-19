/**
 * tushu
 */
package com.alipay.tushu.dal.dos;

import java.util.Date;

/**
 * 用户
 * 
 * @author yuanchen 2014年10月11日 下午11:44:22
 * @version
 */
public class UserDO {
	/** 用户ID */
	private String	id;
	private String	libernaryId;
	/** 登录名 */
	private String	loginName;
	/** 密钥 */
	private String	password;
	private String	realName;
	/** 昵称 */
	private String	nickName;
	/** 类型 */
	private String	type;
	private String	status;
	private String	mobile;
	private String	email;
	/** 创建时间 */
	private Date	gmtCreate;
	/** 修改时间 */
	private Date	gmtModified;

	// ~~ getter & setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLibernaryId() {
		return libernaryId;
	}

	public void setLibernaryId(String libernaryId) {
		this.libernaryId = libernaryId;
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
