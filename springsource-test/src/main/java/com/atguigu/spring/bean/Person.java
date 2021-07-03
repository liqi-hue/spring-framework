package com.atguigu.spring.bean;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: liqi
 * @create 2021-06-30 22:14
 */
//@Data
@Getter
@Component
public class Person implements ApplicationContextAware{
	private String name;
	private int age;
	private Cat cat;
	//自动装配可以拿到 ioc 容器
//	@Autowired
	private ApplicationContext applicationContext;
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	//@Lookup		//(每次调用方法以原型模式得到一个对象)此注解不能使用在@Bean的类上，只能以包扫描的方式注入容器才生效
	public Cat getCat() {
		return cat;
	}
	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public Person() {
		System.out.println("person 创建...");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//利用回调机制把 ioc 容器传入
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
