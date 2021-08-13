package com.shape.services;

import com.google.inject.Inject;

public class Square implements Shapes {
	private int side;
	
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Inject
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of Square: "+(side*side));
		
	}

	@Override
	public void parameter() {
		System.out.println("Parameter of Square: "+(4*side));
		
	}

}
