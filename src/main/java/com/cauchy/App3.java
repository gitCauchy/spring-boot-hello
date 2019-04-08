//package com.cauchy;
//
//import javax.servlet.ServletRegistration;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//
//import com.cauchy.servlet.SecondServlet;
//
//@SpringBootApplication
//public class App3 {
//	public static void main(String[] args) {
//		SpringApplication.run(App3.class, args);
//	}
//	@Bean
//	public ServletRegistrationBean getServletRegistrationBean() {
//		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
//		bean.addUrlMappings("/second");
//		return bean;
//	}
//}
