package _32.spring.aop.test;

import org.springframework.aop.framework.ProxyFactory;
import _32.spring.aop.service.MessageWriter;
import _32.spring.aop.service.SimpleAroundAdviceImpl;

public class SimpleAroundAdviceTest {
	public static void main(String[] args) {

		MessageWriter target = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleAroundAdviceImpl());
		pf.setTarget(target);		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.printMessage();
	}
}