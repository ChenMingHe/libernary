/**
 * @Project : libernary
 * @Package : com.alipay.tushu.utils
 * @date 2014年10月15日 上午11:59:17
 * Copyright (c) 2014, uestc All Rights Reserved. version V1.0
 */
package com.alipay.tushu.utils;

import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.ui.ModelMap;

import com.alipay.tushu.common.CommonResp;
import com.alipay.tushu.common.ServiceError;

/**
 * 统一处理模板
 * 
 * @author yuanchen 2014年10月15日 上午11:59:17
 * @version
 */
public class HandleTemplate {

	/** 日志 */
	private final static Logger logger = LoggerFactory.getLogger(HandleTemplate.class);

	/** JSON转换处理 */
	private HttpMessageConverter<Object> jsonMessageConverter;

	/**
	 * @Description:
	 * 
	 * @param request
	 * @param response
	 * @param callback
	 * @throws
	 */
	public <T> void process(final HttpServletRequest request, final HttpServletResponse response, final ModelMap model,
			final CallBackHandler callback) {
		Object jsonResult = null;
		CommonResp<T> serviceResult = null;
		try {
			serviceResult = callback.handle();

			if (serviceResult.isSuccess()) {
				jsonResult = callback.onSuccess(serviceResult, model);
			} else {
				jsonResult = callback.onFailed(serviceResult, model);
			}
		} catch (Throwable e) {
			logger.error("", e);
			jsonResult = callback.onException(serviceResult, model);
		} finally {
			writeJsonResponse(request, response, jsonResult);
		}

	}

	/**
	 * @Description: 写入转换结果
	 * 
	 * @param request
	 * @param response
	 * @param jsonResult
	 * @throws
	 */
	private void writeJsonResponse(final HttpServletRequest request, final HttpServletResponse response,
			Object jsonResult) {
		Object responseBody = jsonResult;
		ServerHttpResponse serverHttpResponse = new ServletServerHttpResponse(response);

		// TODO 添加返回错误支持
		if (!(jsonResult instanceof ServiceError)) {
			serverHttpResponse.setStatusCode(HttpStatus.OK);
		}


		// 回写数据
		try {
			jsonMessageConverter.write(responseBody,
					new MediaType("application", "json", Charset.forName(request.getCharacterEncoding())),
					serverHttpResponse);
		} catch (Exception e) {
			logger.error("json serialize error !", e);
		}
	}

	// ~~ getter & setter
	public void setJsonMessageConverter(HttpMessageConverter<Object> jsonMessageConverter) {
		this.jsonMessageConverter = jsonMessageConverter;
	}

}
