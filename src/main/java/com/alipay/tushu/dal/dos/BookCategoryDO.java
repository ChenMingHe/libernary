/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dos
 * @date 2014年10月18日 下午7:04:14
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dos;

import java.util.Date;

/**
 * 图书分类
 * 
 * @author yuanchen 2014年10月18日 下午7:04:14
 * @version
 */
public class BookCategoryDO {

	/**  */
	private String	id;
	/**  */
	private String	parentId;
	/**  */
	private String	name;
	/**  */
	private Date	gmtCreate;
	/**  */
	private Date	gmtModified;

	// ~~ getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
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
