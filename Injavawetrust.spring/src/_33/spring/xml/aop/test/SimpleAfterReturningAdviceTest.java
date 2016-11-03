package _33.spring.xml.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import _33.spring.xml.aop.service.LoggerWriter;

public class SimpleAfterReturningAdviceTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("33.spring.xml.aop.xml");

		LoggerWriter object = context.getBean("proxyAfterReturning", LoggerWriter.class);
		object.log();

		context.close();
	}

}