package com.listener;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.module.GuiceModule;
import com.servelet.GuiceServelet;

@WebListener
public class GuiceListener extends GuiceServletContextListener{
	@Override
	protected Injector getInjector() {
		// TODO Auto-generated method stub
		return Guice.createInjector(new GuiceModule());
	}

}
