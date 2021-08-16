package com.drawShape.requests;

import com.drawShape.services.DrawShape;
import com.google.inject.Inject;
import com.google.inject.Singleton;


public class SquareRequest {
	
	DrawShape d;
	
	@Inject
	public SquareRequest(DrawShape d)
	{
		this.d=d;
		System.out.println("SquareRequest");
	}
	
	public void makeRequest() {
		d.draw();
	}
}
