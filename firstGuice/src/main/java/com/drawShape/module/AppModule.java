package com.drawShape.module;

import com.drawShape.annotations.ColorVal;
import com.drawShape.annotations.EdgeVal;
import com.drawShape.services.DrawShape;
import com.drawShape.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Scopes;
import com.google.inject.Singleton;

public class AppModule extends AbstractModule{
	@Inject
	public void configure()
	{
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);;
		bind(String.class).annotatedWith(ColorVal.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeVal.class).toInstance(4);
	}

}
