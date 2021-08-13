package com.shape.modules;

import com.google.inject.AbstractModule;
import com.shape.services.Circle;
import com.shape.services.Shapes;

public class CircleModule extends AbstractModule{
	
	public void configure()
	{
		//bind(Shapes.class).to(Circle.class);
		bind(Double.class).toInstance(4.5);
	}

	
}


