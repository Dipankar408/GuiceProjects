package com.shape.request;

import com.google.inject.Inject;
import com.shape.services.Shapes;

public class SquareRequest {
	@Inject
	Shapes sp;
	
	
	public void makeRequest() {
		sp.area();
		sp.parameter();
	}
	
}
