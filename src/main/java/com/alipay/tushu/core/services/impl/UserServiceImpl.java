/**
 * tushu
 */
package com.alipay.tushu.core.services.impl;

import java.util.Date;

import org.springframework.transaction.support.TransactionTemplate;

import com.alipay.tushu.core.converters.UserConverter;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.services.SequenceService;
import com.alipay.tushu.core.services.SequenceService.TableName;
import com.alipay.tushu.core.services.UserService;
import com.alipay.tushu.dal.dao.UserDAO;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * 
 * 
 * @author yuanchen 2014年10月11日 下午11:40:34
 * @version
 */
public class UserServiceImpl implements UserService {

	/** UserDAO */
	private UserDAO userDAO;

	/** 序列化服务 */
	private SequenceService sequenceService;

	/** 事务模板 */
	private TransactionTemplate transactionTemplate;

	public String createUser(User user) {
		Date currentTime = sequenceService.genernateSystemTime();
		String userId = sequenceService.genernate(TableName.USER);
		UserDO userDO = UserConverter.convertBO2DO(user);
		userDO.setId(userId);
		userDO.setGmtCreate(currentTime);
		userDO.setGmtModified(currentTime);

		return userDAO.create(userDO);
	}

	// ~~ getter & setter
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setSequenceService(SequenceService sequenceService) {
		this.sequenceService = sequenceService;
	}

}
