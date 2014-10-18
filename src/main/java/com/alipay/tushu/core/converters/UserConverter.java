/**
 * tushu
 */
package com.alipay.tushu.core.converters;

import org.springframework.beans.BeanUtils;

import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.model.enums.UserTypeEnum;
import com.alipay.tushu.dal.dos.UserDO;

/**
 * @author yuanchen
 * 
 */
public class UserConverter {

	/**
	 * @Fields IGNORE_PARAM : 忽略拷贝参数
	 */
	private static final String[] IGNORE_PARAM = new String[] { "type" };

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

		BeanUtils.copyProperties(user, userDO, IGNORE_PARAM);

		if (user.getType() != null) {
			userDO.setType(user.getType().name());
		}

		return userDO;
	}

	/**
	 * @Description: Form -》 BO
	 * 
	 * @param form
	 * @return
	 * @throws
	 */
	public static User convertForm2BO(UserSigupForm form) {
		if (form == null) {
			return null;
		}

		User user = new User();
		BeanUtils.copyProperties(form, user);

		user.setType(UserTypeEnum.getTypeByName(form.getUserType()));

		return user;
	}
}
