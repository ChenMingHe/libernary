package com.alipay.tushu.controller.converters;

import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;

public class UserConverter {
	public static User convertForm2BO(UserSigupForm form) {
		User user = new User();

		return user;
	}
}
