package com.alipay.tushu.dal.dos;

import java.util.Date;

/**
 * 图书
 * 
 * @author yuanchen 2014年10月18日 下午6:54:04
 * @version
 */
public class BookDO {
	/**  */
	private String	id;
	/**  */
	private String	bookSearchNo;
	/**  */
	private String	bookTypeId;
	/**  */
	private String	leftCount;
	/**  */
	private String	orderCount;
	/**  */
	private String	borrowCount;
	/**  */
	private String	borrowTotalCount;
	/**  */
	private String	status;
	/**  */
	private String	chineseName;
	/**  */
	private String	name;
	/**  */
	private String	author;
	/**  */
	private String	publisher;
	/**  */
	private String	publisherNo;
	/**  */
	private Date	publisherDate;
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

	public String getBookSearchNo() {
		return bookSearchNo;
	}

	public void setBookSearchNo(String bookSearchNo) {
		this.bookSearchNo = bookSearchNo;
	}

	public String getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(String bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public String getLeftCount() {
		return leftCount;
	}

	public void setLeftCount(String leftCount) {
		this.leftCount = leftCount;
	}

	public String getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

	public String getBorrowCount() {
		return borrowCount;
	}

	public void setBorrowCount(String borrowCount) {
		this.borrowCount = borrowCount;
	}

	public String getBorrowTotalCount() {
		return borrowTotalCount;
	}

	public void setBorrowTotalCount(String borrowTotalCount) {
		this.borrowTotalCount = borrowTotalCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisherNo() {
		return publisherNo;
	}

	public void setPublisherNo(String publisherNo) {
		this.publisherNo = publisherNo;
	}

	public Date getPublisherDate() {
		return publisherDate;
	}

	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
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
