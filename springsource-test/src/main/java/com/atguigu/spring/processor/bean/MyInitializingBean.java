package com.atguigu.spring.processor.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: liqi
 * @create 2021-07-02 21:39
 */
@Component
public class MyInitializingBean implements InitializingBean {
	public MyInitializingBean(){
		System.out.println("MyInitializingBean...");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet...");
	}
}
