package _32.hello.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import _32.hello.aop.service.MessageDecorator;
import _32.hello.aop.service.MessageWriter;

public class HelloAOP {
	public static void main(String[] args) {

		MessageWriter target = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MessageDecorator());
		pf.setTarget(target);
		MessageWriter proxy = (MessageWriter) pf.getProxy();

		proxy.writeMessage();
	}
}