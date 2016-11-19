package _34.spring.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _34.spring.aop.service.Validator;

public class SimpleThrowsAdviceTest {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("34.spring.aop.xml");

		Validator validator = context.getBean("proxyThrows", Validator.class);

		try {
			validator.validateAge(-10);
		} catch (ArithmeticException e) {

		}

		try {
			validator.parseAge("Exception");
		} catch (NumberFormatException e) {

		}

		validator.throwRuntimeException();
		
		context.close();

	}

}