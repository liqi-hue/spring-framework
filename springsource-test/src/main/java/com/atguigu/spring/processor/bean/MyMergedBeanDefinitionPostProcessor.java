package com.atguigu.spring.processor.bean;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author: liqi
 * @create 2021-07-02 21:33
 */
@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostProcessor(){
		System.out.println("MyMergedBeanDefinitionPostProcessor...");
	}
	@Override//实例化bean后执行，可以修改bean定义信息
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("postProcessMergedBeanDefinition...");
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("resetBeanDefinition...");
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
