package _21.application.event.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _21.application.event.model.MessageEvent;

public class MessageEventTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("21.applicationEvent.xml");
		
		ctx.publishEvent(new MessageEvent(new Object(), "Message 1!"));
		ctx.publishEvent(new MessageEvent(new Object(), "Message 2!"));
		ctx.publishEvent(new MessageEvent(new Object(), "Message 3!"));
		
		((ClassPathXmlApplicationContext) ctx).close();

	}
}
