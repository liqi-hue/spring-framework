package com.atguigu.web.controller;

import com.atguigu.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liqi
 * @create 2021-07-08 18:12
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	public HelloController() {
		System.out.println("HelloController...");
	}

	@GetMapping(value = "/hello")
	public String hello(){
		return helloService.sayHello("MVC");
	}
}
