package com.atguigu.spring.bean;

import lombok.Data;

/**
 * @author: liqi
 * @create 2021-06-30 22:14
 */
@Data
public class Person {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
