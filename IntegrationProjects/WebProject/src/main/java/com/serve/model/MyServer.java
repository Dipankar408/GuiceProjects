package com.serve.model;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyServer extends GuiceServletContextListener {

	@Override
	  protected Injector getInjector() {
	    return Guice.createInjector(new ServletModule());
	  }

	  
	}