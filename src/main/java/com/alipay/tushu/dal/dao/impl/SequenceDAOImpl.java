/**
 * @Project : libernary
 * @Package : com.alipay.tushu.dal.dao.impl
 * @date 2014年10月12日 下午9:38:56
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.dal.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alipay.tushu.dal.dao.SequenceDAO;
import com.alipay.tushu.dal.dos.SequenceDO;

/**
 * SequenceDAOImpl
 * 
 * @author yuanchen 2014年10月12日 下午9:38:56
 * @version
 */
public class SequenceDAOImpl extends SqlMapClientDaoSupport implements SequenceDAO {

	/*
	 * @see com.alipay.tushu.dal.dao.SequenceDAO#insert(com.alipay.tushu.dal.dos.SequenceDO)
	 */
	public int insert(SequenceDO sequenceDO) throws DataAccessException {
		if (sequenceDO == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db");
		}

		getSqlMapClientTemplate().insert("MS-SEQUENCE-INSERT", sequenceDO);

		return sequenceDO.getId();
	}

}
