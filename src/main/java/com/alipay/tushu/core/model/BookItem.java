/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.model
 * @date 2014年10月18日 下午11:38:36
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.model;

import java.util.Date;

import com.alipay.tushu.core.model.enums.BookItemStatusEnum;

/**
 * 
 * 
 * @author yuanchen 2014年10月18日 下午11:38:36
 * @version
 */
public class BookItem {
	private String id;
	private User user;
	private Book book;
	private Libernary libernary;
	private BookItemStatusEnum status;
	private Date borrowDeadline;
	private String floor;
	private String bookselfNo;
	private String bookselfRaw;
	private String bookselfCloumn;
	private Date gmtCreate;
	private Date gmtModified;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Libernary getLibernary() {
		return libernary;
	}

	public void setLibernary(Libernary libernary) {
		this.libernary = libernary;
	}

	public BookItemStatusEnum getStatus() {
		return status;
	}

	public void setStatus(BookItemStatusEnum status) {
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
