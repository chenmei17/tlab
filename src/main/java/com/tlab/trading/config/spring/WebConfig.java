package com.tlab.trading.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//(MVC: Controller/View) 위한 Config!!!!!!!!!!!

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tlab.trading", useDefaultFilters = false, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ControllerAdvice.class) })
public class WebConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}

}