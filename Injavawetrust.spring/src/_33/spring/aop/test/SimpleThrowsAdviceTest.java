package _33.spring.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import _33.spring.aop.service.SimpleThrowsAdviceImpl;
import _33.spring.aop.service.Validator;

public class SimpleThrowsAdviceTest {
	public static void main(String[] args) throws Exception {
		Validator errorBean = new Validator();

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(errorBean);
		pf.addAdvice(new SimpleThrowsAdviceImpl());
		Validator validator = (Validator) pf.getProxy();

		try {
			validator.validateAge(-10);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException#catch\n");
		}

		try {
			validator.parseAge("Exception");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException#catch\n");
		}

		try {
			validator.throwRuntimeException();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException#catch\n");
		}
	}

}