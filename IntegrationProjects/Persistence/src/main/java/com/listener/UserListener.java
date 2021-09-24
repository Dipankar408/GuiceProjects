package com.listener;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.service.IntService;
import com.service.MyModule;
import com.service.MyResources;
import com.service.MyService;

@WebListener
public class UserListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		Injector injector = Guice.createInjector(new JpaPersistModule("FirstPersistence"), new MyModule());
		injector.getInstance(PersistService.class).start();
//		injector.getInstance(MyInitializer.class);
		return injector;
	}
	
	

}
