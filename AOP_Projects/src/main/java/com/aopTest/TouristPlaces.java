package com.aopTest;

public class TouristPlaces implements Places{

	@Override
	@TrackVisitor
	public void visitPlace() {
		System.out.println("You are in India");
		System.out.println("You are having fun");
		
	}

}
