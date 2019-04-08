package com.cauchy.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent event) {
		
	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Listener init");
	}

}
