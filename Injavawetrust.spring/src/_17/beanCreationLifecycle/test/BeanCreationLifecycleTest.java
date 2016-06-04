package _17.beanCreationLifecycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _17.beanCreationLifecycle.model.BeanCreationLifecycleWriter;

public class BeanCreationLifecycleTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("17.beanCreation.lifecycle.xml");

		BeanCreationLifecycleWriter beanCreationLifecyle = ctx.getBean("lifecycle",
				BeanCreationLifecycleWriter.class);
		
		System.out.println(beanCreationLifecyle);
		
		((ClassPathXmlApplicationContext) ctx).close();

	}
}
