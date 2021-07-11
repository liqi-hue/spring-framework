package com.atguigu.web.component;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author: liqi
 * @create 2021-07-11 16:32
 */
public class MeinvView implements View {
	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=utf-8");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<h1>"+request.getAttribute("name")+"<h1>");
		stringBuilder.append("<h1></h2>");
		stringBuilder.append("<img src='https://images.chinatimes.com/newsphoto/2020-12-28/1024/20201228001291.jpg'>");
		response.getWriter().write(stringBuilder.toString());
	}
}
