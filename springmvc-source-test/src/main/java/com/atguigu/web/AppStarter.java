package com.atguigu.web;

import com.atguigu.web.config.SpringConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author: liqi
 * @create 2021-07-08 17:50
 * 1) 创建了容器，指定了配置类 (AnnotationConfigWebApplicationContext)
 * 2) 注册一个Servlet DispatcherServlet
 * 3) 所有请求交给 DispatcherServlet
 * 	SpringMVC 功能开启
 * 	Servlet 是javaEE的Web规范，Tomcat是其一个实现
 * 	SPI 机制创建了 AppStarter 并调用 onStartup 方法
 *	spring为我们提供了一个快速整合spring和springMVC的抽象类 AbstractAnnotationConfigDispatcherServletInitializer
 */

public class AppStarter /*implements WebApplicationInitializer */{

//	@Override
//	public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(SpringConfig.class);
//		// 此时 ioc 容器还没有启动,当 tomcat 启动的时候会为每一个Servlet初始化，在DispatcherServlet初始化时刷新容器
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//		ServletRegistration.Dynamic dynamic = servletContext.addServlet("app", dispatcherServlet);
//		dynamic.setLoadOnStartup(1);
//		dynamic.addMapping("/*");
//	}
}
