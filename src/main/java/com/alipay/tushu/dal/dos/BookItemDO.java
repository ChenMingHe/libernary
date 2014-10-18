/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dos
 * @date 2014年10月18日 下午7:37:23
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dos;

import java.util.Date;

/**
 * 图书实例
 * 
 * @author yuanchen 2014年10月18日 下午7:37:23
 * @version
 */
public class BookItemDO {
	private String id;
	private String userId;
	private String bookId;
	private String libernaryId;
	private String status;
	private Date borrowDeadline;
	private String floor;
	private String bookselfNo;
	private String bookselfRaw;
	private String bookselfCloumn;
	private Date gmtCreate;
	private Date gmtModified;

	// ~~ getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getLibernaryId() {
		return libernaryId;
	}

	public void setLibernaryId(String libernaryId) {
		this.libernaryId = libernaryId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBorrowDeadline() {
		return borrowDeadline;
	}

	public void setBorrowDeadline(Date borrowDeadline) {
		this.borrowDeadline = borrowDeadline;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBookselfNo() {
		return bookselfNo;
	}

	public void setBookselfNo(String bookselfNo) {
		this.bookselfNo = bookselfNo;
	}

	public String getBookselfRaw() {
		return bookselfRaw;
	}

	public void setBookselfRaw(String bookselfRaw) {
		this.bookselfRaw = bookselfRaw;
	}

	public String getBookselfCloumn() {
		return bookselfCloumn;
	}

	public void setBookselfCloumn(String bookselfCloumn) {
		this.bookselfCloumn = bookselfCloumn;
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
