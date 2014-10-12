/**
 * tushu
 */
package com.alipay.tushu.controller.form;

import java.io.Serializable;

/**
 * 用户注册表单
 * 
 * @author yuanchen 2014年10月11日 下午11:20:03
 * @version
 */
public class UserSigupForm implements Serializable {
	/**
	 * @Fields serialVersionUID : 序列化ID
	 */
	private static final long serialVersionUID = 5185165416376731175L;

	private String loginName;
	private String password;

	// ~~ getter & setter

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
