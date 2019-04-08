package com.cauchy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.cauchy.filter.SecondFilter;

@SpringBootApplication
public class App5 {
	public static void main(String[] args) {
		SpringApplication.run(App5.class, args);
	}
	
	// 注册Filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
		bean.addUrlPatterns("/secondFilter");
		return bean;
	}
}
