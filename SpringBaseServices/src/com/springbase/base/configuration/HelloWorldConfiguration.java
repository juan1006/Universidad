package com.springbase.base.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @date : 26/5/2016
 * @time : 15:10:43
 * @author : Juan Quispe O.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springbase.base")
public class HelloWorldConfiguration{
	
	
}
