package com.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class ShopingModule extends AbstractModule
{
	public void configure()
	{
		bind(ShopingMall.class).to(ShopingMallUser.class);
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(ShopingTracker.class), new ShopingMallTracker());
	}

}
