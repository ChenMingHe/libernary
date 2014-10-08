/** 
 * tushu
 */
package com.alipay.tushu.core.converters;

import org.springframework.beans.BeanUtils;

import com.alipay.tushu.core.model.User;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * @author yuanchen
 * 
 */
public class UserConverter {
	/**
	 * 将BO对象转换成DO对象
	 * 
	 * @param user
	 * @return
	 */
	public static UserDO convertBO2DO(User user) {
		if (user == null) {
			return null;
		}

		UserDO userDO = new UserDO();

		BeanUtils.copyProperties(user, userDO);

		if (user.getUserType() != null) {
			userDO.setType(user.getUserType().getCode());
		}

		return userDO;
	}
}
