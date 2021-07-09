package com.atguigu.spring;

import com.atguigu.spring.aop.HelloService;
import com.atguigu.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: liqi
 * @create 2021-06-30 22:10
 */

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/beans.xml");
//		Person bean = ac.getBean(Person.class);
//		System.out.println(bean);
//		ac.getBean(HelloService.class).sayHello("雷丰阳");
	}

}
