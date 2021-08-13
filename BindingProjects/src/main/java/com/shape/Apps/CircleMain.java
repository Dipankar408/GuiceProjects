package com.shape.Apps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.shape.modules.CircleModule;
import com.shape.request.CircleRequest;

public class CircleMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new CircleModule());
		CircleRequest cr=in.getInstance(CircleRequest.class);
		cr.makeRequest();

	}

}
