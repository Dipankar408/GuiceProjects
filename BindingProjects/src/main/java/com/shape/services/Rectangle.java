package com.shape.services;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.shape.annotaion.BrthVal;
import com.shape.annotaion.LenVal;

public class Rectangle implements Shapes {
	private double length;
	private double bredth;
	
	@Inject
	public Rectangle(@Named("ln") double length,@BrthVal double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle: "+(length*bredth));
		
	}

	@Override
	public void parameter() {
		System.out.println("Parameter of Rectangle: "+(2*(length+bredth)));
		
	}

}
