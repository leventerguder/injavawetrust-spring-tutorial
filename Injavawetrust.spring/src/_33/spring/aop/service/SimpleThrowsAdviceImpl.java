package _33.spring.aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowsAdviceImpl implements ThrowsAdvice {
		
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("***");
		System.out.println("Generic Exception Capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("***");
	}


	public void afterThrowing(Method method, Object[] args, Object target, ArithmeticException ex)
			throws Throwable {
		System.out.println("***");
		System.out.println("ArithmeticException Capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("Method: " + method.getName());
		System.out.println("***");
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, NumberFormatException ex)
			throws Throwable {
		System.out.println("***");
		System.out.println("NumberFormatException Capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("Method: " + method.getName());
		System.out.println("***");
	}
}