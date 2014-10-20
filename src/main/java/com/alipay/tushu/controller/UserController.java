/**
 * tushu
 */
package com.alipay.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.utils.URLConstants;

/**
 * 用户Controller
 * 
 * @author yuanchen 2014年10月8日 下午10:38:49
 * @version
 */
@Controller
@RequestMapping(value = URLConstants.USER)
@SuppressWarnings("unchecked")
public class UserController extends BaseController {

	/**
	 * @Description: 创建新用户
	 * 
	 * @param model
	 * @param form
	 * @return
	 * @throws
	 */
	@RequestMapping(value = URLConstants.CREATE, method = RequestMethod.POST)
	public void create(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			final @ModelAttribute("form") UserSigupForm form) {
	}


}
