package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author: liqi
 * @create 2021-07-02 21:31
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	public MySmartInstantiationAwareBeanPostProcessor(){
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...");
	}
	@Override// 通过名字预测组件的类型,有机会改变组件的类型
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("predictBeanType...");
		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override// 实例化bean之前返回要使用的构造器，后置处理器将会为bean定义信息设置代理对象构造器
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("determineCandidateConstructors...");
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

	@Override// 可以自己返回早期的Bean引用
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("getEarlyBeanReference...");
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}
}
