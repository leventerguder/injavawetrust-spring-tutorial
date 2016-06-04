package _20.messageSourceAware.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _20.messageSourceAware.service.MessageService;

public class MessageSourceAwareTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("20.messageSourceAware.xml");

		MessageService messageService = ctx.getBean("messageService", MessageService.class);

		messageService.writeMessage("order.information", new Object[]{"1000", "100", "$"}, Locale.US);
		messageService.writeMessage("order.information", new Object[]{"1000", "100", "TL"}, new Locale("tr", "TR"));
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
