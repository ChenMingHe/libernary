/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dos
 * @date 2014年10月12日 下午9:34:55
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dos;

/**
 * 序列化DO
 * 
 * @author yuanchen 2014年10月12日 下午9:34:55
 * @version
 */
public class SequenceDO {
	/** 表名 */
	private String	tbName;
	/** 键值ID */
	private int		id;

	// ~~ getter & setter
	public String getTbName() {
		return tbName;
	}

	public void setTbName(String tbName) {
		this.tbName = tbName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
