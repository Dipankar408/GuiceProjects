package com.listener;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.servlet.DemoServlet;

@WebListener
public class DemoListener extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			public void configureServlets() {
				serve("/*.jsp").with(DemoServlet.class);
			}
		});
	}

}
