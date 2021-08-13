package com.shape.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.shape.services.Shapes;
import com.shape.services.Square;

public class SquareModule extends AbstractModule{

//	public void configure()
//	{
//		bind(Shapes.class).to(Square.class);
//		bind(Integer.class).toInstance(5);
//	}

	Square sq=new Square(5);
	@Provides
	public Shapes provideShapes()
	{
		//Square sq=new Square();
		sq.setSide(8);
		return sq;
	}
}
