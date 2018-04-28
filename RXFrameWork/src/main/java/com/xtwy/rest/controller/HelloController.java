package com.xtwy.rest.controller;

import java.util.HashMap;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;

/**
 * 
 * @作者： 侯建军
 * 
 * @日期：2018年4月24日 下午1:59:35
 * @公司：东软睿道
 * @描述：控制器
 */
@Path("/hello")
public class HelloController {
	@GET
	/*
	 * @QueryParam("name") 参数
	 * @DefaultValue 默认值
	 */
	public Viewable sayHello(@QueryParam("name") @DefaultValue("World") String name) {
		HashMap model = new HashMap();
		// 设置参数，用于jsp页面获取
		model.put("name", name);
		// 视图路径，根据资源类定义为 /WEB-INF/view
		// index.jsp页面
		return new Viewable("/index", model);
	}
	
	@GET
	@Path("xml")
	@Produces(MediaType.APPLICATION_XML)
    public String get() {
        return "一个测试";
    }
}
