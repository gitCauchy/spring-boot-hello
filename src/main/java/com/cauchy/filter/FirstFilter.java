package com.cauchy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="FirstFilter" ,urlPatterns="/first")
public class FirstFilter implements Filter{
	public void destroy() {
	}
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("come in filter");
		arg2.doFilter(arg0, arg1);
		System.out.println("go away");
	}
	public void init(FilterConfig arg0) throws ServletException {	
	}
}