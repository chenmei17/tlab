package com.tlab.trading.config.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages= {"com.tlab.trading.controller"})
public class RootConfig {

}

