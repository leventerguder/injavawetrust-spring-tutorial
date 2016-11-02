package _32.spring.aop.test;

import org.springframework.aop.framework.ProxyFactory;
import _32.spring.aop.service.SimpleThrowsAdviseImpl;
import _32.spring.aop.service.Validator;

public class SimpleThrowsAdviceTest {
	public static void main(String[] args) throws Exception {
		Validator errorBean = new Validator();

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(errorBean);
		pf.addAdvice(new SimpleThrowsAdviseImpl());
		Validator proxy = (Validator) pf.getProxy();

		try {
			proxy.validate(10);
		} catch (Exception e) {

		}
	}

}