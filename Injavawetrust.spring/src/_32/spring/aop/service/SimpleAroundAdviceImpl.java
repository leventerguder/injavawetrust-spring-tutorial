package _32.spring.aop.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAroundAdviceImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("First ");
		Object retVal = invocation.proceed();
		System.out.println("Third");
		return retVal;
	}

}
