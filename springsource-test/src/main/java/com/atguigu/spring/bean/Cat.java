package com.atguigu.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: liqi
 * @create 2021-07-01 11:20
 */
@Component
//@Scope(scopeName = "prototype")
public class Cat implements InitializingBean {
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet...");
	}
}
