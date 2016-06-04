package _19.messageSource.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceBundleMessageSourceTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("19.messageSource.xml");

		String orderInformationUS = ctx.getMessage("order.information", 
				new Object[]{"1000", "100", "$"}, Locale.US);

		String orderInformationTR = ctx.getMessage("order.information", 
				new Object[]{"1000", "100", "TL"}, new Locale("tr", "TR"));
		
		String noMessage = ctx.getMessage("customer",null, "guest" ,Locale.UK );

		System.out.println(orderInformationUS);
		System.out.println(orderInformationTR);
		System.out.println(noMessage);
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
