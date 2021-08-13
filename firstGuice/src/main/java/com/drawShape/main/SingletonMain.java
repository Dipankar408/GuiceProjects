package com.drawShape.main;

import com.drawShape.module.AppModule;
import com.drawShape.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class SingletonMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new AppModule());
		System.out.println(in);
		SquareRequest sq1=in.getInstance(SquareRequest.class);
		sq1.makeRequest();
		
		SquareRequest sq2=in.getInstance(SquareRequest.class);
		sq2.makeRequest();
		
		SquareRequest sq3=in.getInstance(SquareRequest.class);
		sq3.makeRequest();
		
		boolean ch1=sq1.equals(sq2);
		boolean ch2=sq2.equals(sq3);
		System.out.println(ch1+"     "+ch2);
	}

}
