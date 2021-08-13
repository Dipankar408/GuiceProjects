package com.aopTest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PlacesMain {
	public static void main(String[] args) {
		Injector in=Guice.createInjector(new PlaceModule());
		RequestTouristPlaces rtp=in.getInstance(RequestTouristPlaces.class);
		rtp.makePlaceRequest();
	}
}
