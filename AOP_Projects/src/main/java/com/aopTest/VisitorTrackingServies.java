package com.aopTest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class VisitorTrackingServies implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("-------Welcome To India---------");
		Object tourist=invocation.proceed();
		System.out.println("Thank you. Visit again");
		return tourist;
	}

}
