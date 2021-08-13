package com.shape.request;

import com.google.inject.Inject;
import com.shape.services.Shapes;

public class CircleRequest {
	Shapes sh;
	@Inject
	public CircleRequest(Shapes sh)
	{
		this.sh=sh;
	}
	
	public void makeRequest()
	{
		sh.area();
		sh.parameter();
	}
}
