package com.atguigu.spring;

import com.atguigu.spring.aop.HelloService;
import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import com.atguigu.spring.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author: liqi
 * @create 2021-07-01 11:05
 */

public class AnnotationMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person bean = ac.getBean(Person.class);
//		System.out.println(bean);
//		System.out.println(ac.getBean(Cat.class));
//		Cat bean1 = ac.getBean(Cat.class);
//		Cat bean2 = ac.getBean(Cat.class);
//		System.out.println(bean1 == bean2);
//		Person bean3 = ac.getBean(Person.class);
//		Person bean4 = ac.getBean(Person.class);
//		System.out.println("person.cat: " + (bean3.getCat() == bean4.getCat()));
//		Arrays.asList(ac.getBeanDefinitionNames()).forEach(s -> {
//			System.out.println(s);
//		});
//		Person bean = ac.getBean(Person.class);
//		System.out.println("ac == application	" + (ac == bean.getApplicationContext()));
		ac.getBean(HelloService.class).sayHello("zhangsan");
	}
}
