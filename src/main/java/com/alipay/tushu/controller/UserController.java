/** 
 * tushu
 */
package com.alipay.tushu.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alipay.tushu.biz.managers.UserManager;
import com.alipay.tushu.controller.converters.UserConverter;
import com.alipay.tushu.controller.form.UserSigupForm;
import com.alipay.tushu.core.model.User;

/** 
* 用户Controller
* 
* @author yuanchen 2014年10月8日 下午10:38:49 
* @version  
*/
@Controller
public class UserController {
	
	/** 
	* @Fields userManager : 
	*/ 
	private UserManager userManager;
	
	/** 
	* @Fields CREATE_RESULT : 结果页面
	*/ 
	private static final String CREATE_RESULT = "result.vm";
	
	/** 
	* @Fields ERROR_PAGE : 错误页面
	*/ 
	private static final String ERROR_PAGE = "error.vm";

	/** 
	* @Description: 创建新用户
	* 
	* @param model
	* @param form
	* @return    
	* @throws 
	*/
	@RequestMapping(value = "/user/createuser.json", method = RequestMethod.POST)
	public String create(ModelMap model, @ModelAttribute("form") UserSigupForm form) {
		if (form == null) {
			model.addAttribute("error", "form error");
			return ERROR_PAGE;
		}
		
		User user = UserConverter.convertForm2BO(form);
		String result = userManager.createUser(user);
		
		if (StringUtils.isNotBlank(result)) {
			model.addAttribute("success", true);
		} else {
			model.addAttribute("success", false);
		}
		
		return CREATE_RESULT;
	}

	// ~~ getter & setter
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

}
