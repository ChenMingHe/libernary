/** 
 * tushu
 */
package com.alipay.tushu.controller.form;

import java.io.Serializable;

/** 
* 
* 
* @author yuanchen 2014年10月11日 下午11:20:03 
* @version  
*/
public class UserSigupForm implements Serializable {
	//
	private static final long serialVersionUID = 5185165416376731175L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
