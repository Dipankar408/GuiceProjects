package com.shape.Apps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.shape.modules.SquareModule;
import com.shape.request.SquareRequest;

public class SquareMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new SquareModule());
		SquareRequest sr=in.getInstance(SquareRequest.class);
		sr.makeRequest();
	}

}
