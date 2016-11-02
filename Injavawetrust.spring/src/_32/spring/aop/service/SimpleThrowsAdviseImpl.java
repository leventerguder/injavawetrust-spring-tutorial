package _32.spring.aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowsAdviseImpl implements ThrowsAdvice {
		
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("***");
		System.out.println("Generic Exception Capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("***\n");
	}


	public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException ex)
			throws Throwable {
		System.out.println("***");
		System.out.println("IllegalArgumentException Capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("Method: " + method.getName());
		System.out.println("***\n");
	}
}