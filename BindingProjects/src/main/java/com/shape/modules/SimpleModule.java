package com.shape.modules;

import javax.inject.Provider;

import com.google.inject.AbstractModule;
import com.shape.request.SimpleProvider;
import com.shape.services.Shapes;

public class SimpleModule extends AbstractModule{
	public void configure()
	{
		bind(Shapes.class).toProvider(SimpleProvider.class);
	}
}
