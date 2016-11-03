package _32.spring.aop.test;

import org.springframework.aop.framework.ProxyFactory;
import _32.spring.aop.service.LoggerWriter;
import _32.spring.aop.service.SimpleBeforeAdviceImpl;

public class SimpleBeforeAdviceTest {
	public static void main(String[] args) {

		LoggerWriter target = new LoggerWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleBeforeAdviceImpl());
		pf.setTarget(target);
		LoggerWriter proxy = (LoggerWriter) pf.getProxy();
		proxy.log();
	}

}