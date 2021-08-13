package com.aop;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ShopingMain {

	public static void main(String[] args) {
		Injector in=Guice.createInjector(new ShopingModule());
		Shopers shoper=in.getInstance(Shopers.class);
		shoper.makeShoping();

	}

}
