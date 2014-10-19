/**
 * @Project : libernary
 * @Package : com.alipay.tushu.controller.dtos
 * @date 2014年10月19日 下午9:18:14
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.controller.dtos;

import java.util.Date;

/**
 * 
 * 
 * @author yuanchen 2014年10月19日 下午9:18:14
 * @version
 */
public class BookCategoryDTO {
	private String			id;
	private BookCategoryDTO	parent;
	private String			name;
	private Date			gmtCreate;
	private Date			gmtModified;

	// ~~ getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BookCategoryDTO getParent() {
		return parent;
	}

	public void setParent(BookCategoryDTO parent) {
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
