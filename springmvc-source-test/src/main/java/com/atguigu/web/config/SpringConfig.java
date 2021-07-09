package com.atguigu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liqi
 * @create 2021-07-08 17:53
 * 不扫描controller
 */
@Configuration
@ComponentScan(basePackages = "com.atguigu.web",excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = RestController.class)
})
public class SpringConfig {

}
