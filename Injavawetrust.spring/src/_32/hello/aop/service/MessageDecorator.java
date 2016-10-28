package _32.hello.aop.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageDecorator implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.print("First ");
		Object retVal = invocation.proceed();
		System.out.println("Third");
		return retVal;
	}
}