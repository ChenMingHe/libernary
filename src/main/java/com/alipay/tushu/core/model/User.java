package com.alipay.tushu.core.model;

import java.util.Date;
import java.util.List;

import com.alipay.tushu.core.model.enums.UserStatusEnum;
import com.alipay.tushu.core.model.enums.UserTypeEnum;

/**
 * 用户领域模型
 * 
 * @author yuanchen
 * 
 */
public class User {

	/** 用户ID */
	private String			id;
	private Libernary		libernary;
	/** 登录名 */
	private String			loginName;
	/** 密钥 */
	private String			password;
	private String			realName;
	/** 昵称 */
	private String			nickName;
	/** 类型 */
	private UserTypeEnum	type;
	private UserStatusEnum	status;
	private String			mobile;
	private String			email;

	private List<Book>		bookStore;
	private List<BookItem>	bookOrder;
	/** 创建时间 */
	private Date			gmtCreate;
	/** 修改时间 */
	private Date			gmtModified;

	// ~~ getter & setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Libernary getLibernary() {
		return libernary;
	}

	public void setLibernary(Libernary libernary) {
		this.libernary = libernary;
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

	public UserTypeEnum getType() {
		return type;
	}

	public void setType(UserTypeEnum type) {
		this.type = type;
	}

	public UserStatusEnum getStatus() {
		return status;
	}

	public void setStatus(UserStatusEnum status) {
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

	public List<Book> getBookStore() {
		return bookStore;
	}

	public void setBookStore(List<Book> bookStore) {
		this.bookStore = bookStore;
	}

	public List<BookItem> getBookOrder() {
		return bookOrder;
	}

	public void setBookOrder(List<BookItem> bookOrder) {
		this.bookOrder = bookOrder;
	}

}
