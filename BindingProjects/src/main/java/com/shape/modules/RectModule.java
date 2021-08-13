package com.shape.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.shape.annotaion.BrthVal;
import com.shape.annotaion.LenVal;
import com.shape.services.Rectangle;
import com.shape.services.Shapes;

public class RectModule extends AbstractModule{

	public void configure() {
		bind(Shapes.class).to(Rectangle.class);
//		bind(Double.class).annotatedWith(LenVal.class).toInstance(6.4);
		bind(Double.class).annotatedWith(Names.named("ln")).toInstance(6.5);
		bind(Double.class).annotatedWith(BrthVal.class).toInstance(4.5);
	}
}
