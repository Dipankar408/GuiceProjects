package com.drawShape.requests;

import com.drawShape.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
	@Inject
	DrawShape d;
	
//	public SquareRequest(DrawShape d)
//	{
//		this.d=d;
//	}
	
	public void makeRequest() {
		d.draw();
	}
}
