package com.cauchy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="FirstFilter",urlPatterns="/firstFilter")
public class FirstFilter implements Filter{
	public void destroy() {
		
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain filter) throws IOException,ServletException{
		System.out.println("come in filter");
		filter.doFilter(request, response);
		System.out.println("go away");
	}
	public void init(FilterConfig config) throws ServletException{
		
	}
}
