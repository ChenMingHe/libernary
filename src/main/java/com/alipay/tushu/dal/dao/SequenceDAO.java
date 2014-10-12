/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dao
 * @date 2014年10月12日 下午8:55:34
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dao;

import org.springframework.dao.DataAccessException;

import com.alipay.tushu.dal.dos.SequenceDO;

/**
 * 序列化服务DAO
 * 
 * @author yuanchen 2014年10月12日 下午8:55:34
 * @version
 */
public interface SequenceDAO {
	/**
	 * @Description: 插入
	 * 
	 * @param sequenceDO
	 * @return
	 * @throws DataAccessException
	 * @throws
	 */
	int insert(SequenceDO sequenceDO) throws DataAccessException;
}
