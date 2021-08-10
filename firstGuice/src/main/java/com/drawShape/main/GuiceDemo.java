package com.drawShape.main;

import com.drawShape.module.AppModule;
import com.drawShape.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	public static void main(String[] args) {

		Injector injector=Guice.createInjector(new AppModule());
		SquareRequest request=injector.getInstance(SquareRequest.class);
		request.makeRequest();

	}

}
