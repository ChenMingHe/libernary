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
	private String passwd;
	/** 昵称 */
	private String name;
	/** 类型 */
	private String type;

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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
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
