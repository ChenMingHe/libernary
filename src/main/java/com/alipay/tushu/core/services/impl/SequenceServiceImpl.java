/**
 * @Project : libernary
 * @Package : com.alipay.tushu.core.services.impl
 * @date 2014年10月12日 下午8:53:59
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.core.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.tushu.core.services.SequenceService;
import com.alipay.tushu.dal.dao.SequenceDAO;
import com.alipay.tushu.dal.dos.SequenceDO;

/**
 * SequenceService实现
 * 
 * @author yuanchen 2014年10月12日 下午8:53:59
 * @version
 */
public class SequenceServiceImpl implements SequenceService {

	/** 日志 */
	private final static Logger logger = LoggerFactory.getLogger(SequenceServiceImpl.class);

	/** 数据源 */
	private DataSource dataSource;

	/** 序列化服务 */
	private SequenceDAO sequenceDAO;

	/*
	 * @see
	 * com.alipay.tushu.core.services.SequenceService#genernate(com.alipay.tushu
	 * .core.services.SequenceService.TableName)
	 */
	public String genernate(TableName tableName) {
		SequenceDO sequenceDO = new SequenceDO();
		sequenceDO.setTbName(tableName.name());

		int nId = sequenceDAO.insert(sequenceDO);

		String nSequence = alignRight(Integer.toString(nId), Strategy.DEFAULT.getSize(),
				Strategy.DEFAULT.getPadString());

		return nSequence;
	}

	/**
	 * @Description:
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 * @throws
	 */
	private String alignRight(String str, int size, String padStr) {
		if (str == null) {
			return null;
		}

		if (padStr == null || padStr.length() == 0) {
			padStr = " ";
		}

		int padLen = padStr.length();
		int strLen = str.length();
		int pads = size - strLen;

		if (pads <= 0) {
			return str;
		}

		if (pads == padLen) {
			return padStr.concat(str);
		} else if (pads < padLen) {
			return padStr.substring(0, pads);
		} else {
			char[] padding = new char[pads];
			char[] padChars = padStr.toCharArray();

			for (int i = 0; i < pads; i++) {
				padding[i] = padChars[i % padLen];
			}

			return new String(padding).concat(str);
		}
	}

	/*
	 * @see com.alipay.tushu.core.services.SequenceService#genernateSystemTime()
	 */
	public Date genernateSystemTime() {
		Timestamp systemTime = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement("select current_timestamp() ");

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				systemTime = resultSet.getTimestamp(1);
				break;
			}
		} catch (Exception e) {
			throw new RuntimeException("ERROR ## get current_timestamp from mysql db has an error", e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				logger.error("ERROR ## close the jdbc resource has an error", e);
			}
		}

		if (systemTime != null) {
			return new Date(systemTime.getTime());
		}

		return null;
	}

	// ~~ getter & setter
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setSequenceDAO(SequenceDAO sequenceDAO) {
		this.sequenceDAO = sequenceDAO;
	}

}
