/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月15日 下午8:32:24
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

import java.util.List;

import org.springframework.ui.ModelMap;

import com.alipay.tushu.common.resps.CommonResp;
import com.alipay.tushu.common.resps.PaginationResp;

/**
 * 统一处理模板
 * 
 * @author yuanchen 2014年10月15日 下午8:32:24
 * @version
 */
public abstract class CallBackHandler {


	/**
	 * @Description: 处理函数
	 * 
	 * @return
	 * @throws Exception
	 * @throws
	 */
	abstract public <T> CommonResp<T> handle() throws Exception;

	/**
	 * @Description: 处理成功逻辑
	 * 
	 * @param result
	 * @param model
	 * @return
	 * @throws Exception
	 * @throws
	 */
	public <T> Object onSuccess(CommonResp<T> result, ModelMap model) throws Exception {
		Object data = null;
		if (result instanceof PaginationResp) {
			PaginationResp<T> paginationResp = (PaginationResp<T>) result;
			data = paginationResp.getList() == null ? paginationResp.getResultMsg() : getPaginationData(paginationResp);
		} else {
			data = result.getTarget() == null ? result.getResultMsg() : result.getTarget();
		}
		return data;
	}



	/**
	 * @Description: 处理失败逻辑
	 * 
	 * @param result
	 * @param model
	 * @return
	 * @throws Exception
	 * @throws
	 */
	public <T> Object onFailed(CommonResp<T> result, ModelMap model) throws Exception {
		return null;
	}

	public <T> Object onException(CommonResp<T> result, ModelMap model) {
		return null;
	}

	class PaginationData<T> {
		private final int startIndex;
		private final int pageSize;
		private final int totalSize;
		private final int currentPage;
		private final List<T> list;

		PaginationData(int startIndex, int pageSize, int totalSize, int currentPage, List<T> list) {
			this.startIndex = startIndex;
			this.pageSize = pageSize;
			this.totalSize = totalSize;
			this.currentPage = currentPage;
			this.list = list;
		}

		public int getStartIndex() {
			return startIndex;
		}

		public int getPageSize() {
			return pageSize;
		}

		public int getTotalSize() {
			return totalSize;
		}

		public int getCurrentPage() {
			return currentPage;
		}

		public List<T> getList() {
			return list;
		}

	}

	/**
	 * @Description: 获取分页数据
	 * 
	 * @param data
	 * @return
	 * @throws
	 */
	private <T> PaginationData<T> getPaginationData(PaginationResp<T> data) {
		return new PaginationData<T>(data.getStartIndex(), data.getPageSize(), data.getTotalSize(),
				data.getCurrentPage(), data.getList());
	}
}
