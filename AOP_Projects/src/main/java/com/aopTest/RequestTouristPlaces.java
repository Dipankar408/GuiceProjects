package com.aopTest;

import com.google.inject.Inject;

public class RequestTouristPlaces {
	Places place;
	@Inject
	public RequestTouristPlaces(Places place) {
		super();
		this.place = place;
	}
	
	public void makePlaceRequest()
	{
		place.visitPlace();
	}
}
