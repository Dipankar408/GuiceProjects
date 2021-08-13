package com.aop;

public class ShopingMallUser implements ShopingMall{

	@Override
	@ShopingTracker
	public void Shopping() {
		System.out.println("Shoping is going on");
		
	}

}
