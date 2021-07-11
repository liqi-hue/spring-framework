package com.atguigu.web.controller;

import com.atguigu.web.exception.InvalidException;
import com.atguigu.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author: liqi
 * @create 2021-07-08 18:12
 */
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	public HelloController() {
		System.out.println("HelloController...");
	}

	@GetMapping(value = "/hello")
	public String hello(RedirectAttributes ra){
		//重定向携带数据，保存在 Session中
		ra.addFlashAttribute("aa","bbb");

//		int i = 10 / 0;
		return helloService.sayHello("MVC");
	}
	@ResponseBody
	@GetMapping("/say/{name}")
	public String sayHello(@PathVariable("name") String name, Model model){
		model.addAttribute("name",name);
		if (name.equals("aaa")){
			throw new InvalidException();
		}
		return "meinv:" + name;
	}
}
