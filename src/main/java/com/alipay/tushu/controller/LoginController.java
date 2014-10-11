/**
 * @Project : libernary
 * @Package : com.alipay.tushu.controller
 * @date 2014年10月9日 下午10:37:20
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.controller.converters.UserConverter;
import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;
import com.alipay.tushu.utils.UriContext;

/**
 * 登陆控制
 * 
 * @author yuanchen 2014年10月9日 下午10:37:20
 * @version
 */
@Controller
public class LoginController {

	/**
	 * @Fields userManager : 用户管理器
	 */
	private UserManager userManager;

	/**
	 * @Fields LOGIN_PAGE : 登陆页面
	 */
	private final static String LOGIN_PAGE = "login.vm";

	/**
	 * @Fields SIGUP_PAGE : 注册页面
	 */
	private final static String SIGUP_PAGE = "sigup.vm";

	/**
	 * @Description: 登陆页面
	 * 
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("UriContext", new UriContext());
		return LOGIN_PAGE;
	}

	/**
	 * @Description: 注册页面
	 * 
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/sigup.htm", method = RequestMethod.GET)
	public String sigupDoGet(ModelMap model) {
		model.addAttribute("UriContext", new UriContext());
		return SIGUP_PAGE;
	}

	/**
	 * @Description: 注册页面
	 * 
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/sigup.htm", method = RequestMethod.GET)
	public String sigupDoPost(ModelMap model,
			@ModelAttribute("form") UserSigupForm form) {
		User user = UserConverter.convertForm2BO(form);
		String result = userManager.createUser(user);
		model.addAttribute("result", result);
		model.addAttribute("UriContext", new UriContext());
		return SIGUP_PAGE;
	}

	// ~~ getter & setter
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

}
