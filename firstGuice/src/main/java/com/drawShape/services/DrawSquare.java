package com.drawShape.services;

import com.drawShape.annotations.ColorVal;
import com.drawShape.annotations.EdgeVal;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape{
	private String color;
	private int edge;
	
	@Inject
	public DrawSquare(@ColorVal String color, @EdgeVal int edge) {
		super();
		this.color = color;
		this.edge = edge;
	}


	@Override
	public void draw() {
		System.out.println("Drawing Square of color: "+color+" and edge: "+edge);
		
	}

}
