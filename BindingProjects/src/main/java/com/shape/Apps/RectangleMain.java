package com.shape.Apps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.shape.modules.RectModule;
import com.shape.request.RectangleRequest;

public class RectangleMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new RectModule());
		RectangleRequest rq=in.getInstance(RectangleRequest.class);
		rq.makeRequest();

	}

}
