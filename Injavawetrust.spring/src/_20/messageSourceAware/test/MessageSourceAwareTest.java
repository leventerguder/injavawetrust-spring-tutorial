package _20.messageSourceAware.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _20.messageSourceAware.service.MessageService;

public class MessageSourceAwareTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("20.messageSourceAware.xml");

		MessageService messageService = ctx.getBean("messageService", MessageService.class);
		MessageSource messageSource = messageService.getMessageSource();

		String messageEN = messageSource.getMessage("order.information", new Object[] { "1000", "100", "$" },
				Locale.US);
		String messageTR = messageSource.getMessage("order.information", new Object[] { "1000", "100", "TL" },
				new Locale("tr", "TR"));

		System.out.println(messageEN);
		System.out.println(messageTR);
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
