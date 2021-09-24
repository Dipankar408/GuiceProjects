package com.listener;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.servlet.DemoServlet;

import MyWeb.AddServlet;

@WebListener
public class DemoListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			
			public void configureServlets() {
//				serve("home.jsp").with(AddServlet.class);
				serve("/add").with(AddServlet.class);
				serve("/demo").with(DemoServlet.class);
			}
		});
	}

}
