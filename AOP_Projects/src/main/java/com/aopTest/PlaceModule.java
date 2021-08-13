package com.aopTest;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class PlaceModule extends AbstractModule{
	public void configure()
	{
		bind(Places.class).to(TouristPlaces.class);
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(TrackVisitor.class),new VisitorTrackingServies());
		
	}
}
