/**
 * @Project : libernary
 * @Package : com.alipay.tushu.common
 * @date 2014年10月15日 下午8:55:48
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.common;

import java.util.List;

/**
 * 
 * 
 * @author yuanchen 2014年10月15日 下午8:55:48
 * @version
 */
public class PaginationResp<T> extends CommonResp<T> {
	/** 每页默认大小 */
	public static final int DEFAULT_ITEM_PER_PAGE = 10;

	/** 其实项编号 */
	private int startIndex;

	/** 每页大小 */
	private int pageSize;

	/** 总记录书 */
	private int totalSize;

	/** 当前页 */
	private int currentPage;

	/** 返回结果 */
	private List<T> list;

	// ~~ Constructer
	PaginationResp() {
		super();
	}

	PaginationResp(List<T> list, boolean success) {
		super(success);
		this.list = list;
	}

	PaginationResp(boolean success, ErrorCode errorCode) {
		super(success, errorCode);
	}

	PaginationResp(boolean success, ErrorCode errorCode, String resuletMsg) {
		super(success, errorCode, resuletMsg);
	}

	// ~~ getter & setter
	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
