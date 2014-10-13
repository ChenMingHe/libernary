package com.alipay.tushu.controller.converters;

import org.springframework.beans.BeanUtils;

import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.core.model.enums.UserTypeEnum;

/**
 * 用户转换工具类
 * 
 * @author yuanchen 2014年10月11日 下午11:36:32
 * @version
 */
public class UserConverter {
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

		user.setType(UserTypeEnum.getbyName(form.getUserType()));

		return user;
	}
}
