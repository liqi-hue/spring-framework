package com.atguigu.web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: liqi
 * @create 2021-07-08 21:21
 */
@Service
public class HelloService {
	public HelloService() {
		System.out.println("HelloService");
	}

	public String sayHello(String name){
		return "hello " + name;
	}
}
