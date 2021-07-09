package com.atguigu.web;

import com.atguigu.web.config.SpringConfig;
import com.atguigu.web.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author: liqi
 * @create 2021-07-08 20:34
 * 快速整合 spring 和 springMVC
 */

public class QuickAppStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 根容器配置类(spring容器)
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SpringConfig.class};
	}
	// Web容器配置类(springMVC容器)
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMVCConfig.class};
	}
	//Servlet 映射
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
