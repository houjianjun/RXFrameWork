package com.xtwy.common;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

/**
 * 
 * @作者： 侯建军
 * 
 * @日期：2018年4月24日 下午1:55:06
 * @公司：东软睿道
 * @描述：资源配置类
 */
public class RestApplication extends ResourceConfig {
	public RestApplication() {
		// 配置控制器路径
		packages("com.xtwy.rest.controller");
		packages("com.xtwy.controller");
		// 注册JSON转换器
		register(JacksonJsonProvider.class);
		// 注册MVC支持
		register(JspMvcFeature.class);
		// 配置模板路径,JSP文件是在项目/WEB-INF/view中
		property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/view");
	}
}
