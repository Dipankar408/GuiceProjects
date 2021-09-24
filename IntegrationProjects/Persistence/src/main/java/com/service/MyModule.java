package com.service;

import javax.servlet.Filter;

import com.google.inject.AbstractModule;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

public class MyModule extends AbstractModule {

	protected void configure() {
//	    install(new JpaPersistModule("FirstPersistence"));  // like we saw earlier.
		bind(MyResources.class);
	    bind(IntService.class).to(MyService.class);
	  }

}
