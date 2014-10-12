package com.alipay.tushu.controller.converters;

import org.springframework.beans.BeanUtils;

import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;

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
		User user = new User();
		BeanUtils.copyProperties(form, user);
		return user;
	}
}
