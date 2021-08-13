package com.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TrackerService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Before "+invocation.getMethod().getName());
		Object res=invocation.proceed();
		System.out.println("After "+invocation.getMethod().getName());
		return res;
	}

}
