package com.atguigu.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: liqi
 * @create 2021-07-04 17:54
 */
@Component
public class A {
	@Autowired
	private B b;
}
