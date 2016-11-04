package _33.spring.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _33.spring.aop.service.LoggerWriter;

public class SimpleBeforeAdviceTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("33.spring.aop.xml");
		
		LoggerWriter object = context.getBean("proxyBefore", LoggerWriter.class);
		object.log();

		context.close();
	}
}