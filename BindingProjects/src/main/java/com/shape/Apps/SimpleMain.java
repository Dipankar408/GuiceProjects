package com.shape.Apps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.shape.modules.SimpleModule;
import com.shape.request.SimpleProvider;
import com.shape.request.SimpleRequest;
import com.shape.services.Shapes;
import com.shape.services.Simple;

public class SimpleMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new SimpleModule());
		SimpleRequest sp=in.getInstance(SimpleRequest.class);
		sp.makeRequest();
	}

}
