package _32.spring.aop.test;

import org.springframework.aop.framework.ProxyFactory;
import _32.spring.aop.service.SimpleThrowsAdviceImpl;
import _32.spring.aop.service.Validator;

public class SimpleThrowsAdviceTest {
	public static void main(String[] args) throws Exception {
		Validator errorBean = new Validator();

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(errorBean);
		pf.addAdvice(new SimpleThrowsAdviceImpl());
		Validator proxy = (Validator) pf.getProxy();

		try {
			proxy.validateAge(-10);
		} catch (ArithmeticException e) {

		}

		try {
			proxy.parseAge("Exception");
		} catch (NumberFormatException e) {

		}
	
		proxy.throwRuntimeException();

	}

}