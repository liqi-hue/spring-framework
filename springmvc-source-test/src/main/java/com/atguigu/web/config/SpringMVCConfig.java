package com.atguigu.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liqi
 * @create 2021-07-08 20:44
 * 只扫描controller
 */
@Configuration
@ComponentScan(basePackages = "com.atguigu.web",includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = false)
public class SpringMVCConfig {

}
