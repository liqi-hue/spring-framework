package com.atguigu.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author: liqi
 * @create 2021-07-11 16:42
 */
//@Component
public class MeinvViewResolver implements ViewResolver {
	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		if (viewName.startsWith("meinv:")){
			return new MeinvView();
		}
		return null;
	}
}
