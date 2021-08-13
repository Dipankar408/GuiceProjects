package com.shape.services;

import com.google.inject.Inject;

public class Circle implements Shapes{
	private double radius;
	
	@Inject
	public Circle(double radius)
	{
		this.radius=radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle: "+(3.143*radius*radius));
		
	}

	@Override
	public void parameter() {
		System.out.println("Parameter of Circle: "+(2*3.143*radius));
		
	}

}
