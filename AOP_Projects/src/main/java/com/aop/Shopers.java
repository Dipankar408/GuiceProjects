package com.aop;

import com.google.inject.Inject;

public class Shopers {
	private ShopingMall sm;

	@Inject
	public Shopers(ShopingMall sm) {
		super();
		this.sm = sm;
	}
	
	public void makeShoping()
	{
		sm.Shopping();
	}
	
	
}
