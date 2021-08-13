package com.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ShopingMallTracker implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Welcome to "+invocation.getMethod().getName());
		Object obj=invocation.proceed();
		System.out.println("Thank you for "+invocation.getMethod().getName());
		return obj;
	}

}
