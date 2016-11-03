package _33.spring.xml.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import _33.spring.xml.aop.service.LoggerWriter;

public class SimpleAroundAdviceTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("33.spring.xml.aop.xml");

		LoggerWriter object = context.getBean("proxyAround", LoggerWriter.class);
		object.log();

		context.close();
	}
}