package _33.spring.aop.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAroundAdviceImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Before !");
		Object retVal = invocation.proceed();
		System.out.println("After ! ");
		return retVal;
	}

}