package _16.springAwareness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _16.springAwareness.model.SpringAwarenessWriter;

public class SpringAwarenessTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("16.springAwareness.xml");

		SpringAwarenessWriter springAwarenessWriter = ctx.getBean("springAwarenessWriter", SpringAwarenessWriter.class);
		springAwarenessWriter.log();

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
