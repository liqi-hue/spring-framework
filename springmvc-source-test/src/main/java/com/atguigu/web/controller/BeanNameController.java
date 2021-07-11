package com.atguigu.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: liqi
 * @create 2021-07-10 8:24
 */
@org.springframework.stereotype.Controller("/beanName")
public class BeanNameController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().write("I am BeanNameController");
		return null;
	}
}
