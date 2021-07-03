package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: liqi
 * @create 2021-07-01 11:05
 */
@Configuration
@ComponentScan(basePackages = "com.atguigu.spring")
//@Import(MainConfig.MyBeanRegister.class)
public class MainConfig {

	//@Bean
/*	public Person person(){
		return new Person("张三",23);
	}
	static class MyBeanRegister implements ImportBeanDefinitionRegistrar{
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			BeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
			registry.registerBeanDefinition("person",beanDefinition);
		}
	}*/
}

