/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.model
 * @date 2014年10月18日 下午11:41:35
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.model;

import java.util.Date;

/**
 * 图书类目
 * 
 * @author yuanchen 2014年10月18日 下午11:41:35
 * @version
 */
public class BookCategory {
	private String id;
	private BookCategory parent;
	private String name;
	private Date gmtCreate;
	private Date gmtModified;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BookCategory getParent() {
		return parent;
	}

	public void setParent(BookCategory parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
