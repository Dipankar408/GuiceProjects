package com.drawShape.main;

import com.drawShape.module.AppModule;
import com.drawShape.requests.SquareRequest;
import com.drawShape.services.DrawShape;
import com.drawShape.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class SingletonMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new AppModule());
//		System.out.println(in);
//		SquareRequest sq1=in.getInstance(SquareRequest.class);
//		System.out.println(sq1);
//		sq1.makeRequest();
//		
//		SquareRequest sq2=in.getInstance(SquareRequest.class);
//		System.out.println(sq2);
//		sq2.makeRequest();
//		
//		SquareRequest sq3=in.getInstance(SquareRequest.class);
//		System.out.println(sq3);
//		sq3.makeRequest();
		DrawShape ds=in.getInstance(DrawShape.class);
		System.out.println(ds);
		ds.draw();
		
		DrawShape ds1=in.getInstance(DrawShape.class);
		System.out.println(ds1);
		ds1.draw();
		
		DrawShape ds2=in.getInstance(DrawShape.class);
		System.out.println(ds2);
		ds2.draw();
		
		
	}

}
