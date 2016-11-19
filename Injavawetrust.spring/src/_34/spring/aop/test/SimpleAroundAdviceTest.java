package _34.spring.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _34.spring.aop.service.LoggerWriter;

public class SimpleAroundAdviceTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("34.spring.aop.xml");

		LoggerWriter object = context.getBean("proxyAround", LoggerWriter.class);
		object.log();

		context.close();
	}
}