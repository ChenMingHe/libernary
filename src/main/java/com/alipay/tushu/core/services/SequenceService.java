/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dao
 * @date 2014年10月12日 下午8:49:59
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.services;

import java.util.Date;

/**
 * 序列化服务
 * 
 * @author yuanchen 2014年10月12日 下午8:49:59
 * @version
 */
public interface SequenceService {
	/**
	 * sequence 生成策略
	 * 
	 * @author yuanchen 2014年10月12日 下午10:06:47
	 * @version SequenceService
	 */
	public enum Strategy {
		DEFAULT(10, "0"), FLOW(16, "0"), ;

		/** 要填充的数值的数量 */
		private final int size;
		/** 填充的数值 */
		private final String padString;

		/**
		 * <p>Title: </p>
		 * <p>Description: </p>
		 * @param size
		 * @param padString
		 */
		private Strategy(int size, String padString) {
			this.size = size;
			this.padString = padString;
		}

		// ~~ getter & setter
		public int getSize() {
			return size;
		}

		public String getPadString() {
			return padString;
		}

	}

	/**
	 * 表名
	 * 
	 * @author yuanchen 2014年10月12日 下午10:00:07
	 * @version SequenceService
	 */
	public enum TableName {
		USER,
	}

	/**
	 * @Description: 根据表名生成序列化ID
	 * 
	 * @param tableName
	 * @return
	 * @throws
	 */
	String genernate(TableName tableName);

	/**
	 * @Description: 获取数据库时间作为系统时间
	 * 
	 * @return
	 * @throws
	 */
	Date genernateSystemTime();
}
