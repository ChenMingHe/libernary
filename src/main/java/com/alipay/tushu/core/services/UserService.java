/** 
 * tushu
 */
package com.alipay.tushu.core.services;

import com.alipay.tushu.core.converters.exceptions.CoreException;
import com.alipay.tushu.core.model.User;

/**
 * @author yuanchen
 * 
 */
public interface UserService {
	/**
	 * @param user
	 * @return
	 * @throws CoreException
	 */
	String createUser(User user) throws CoreException;
}
