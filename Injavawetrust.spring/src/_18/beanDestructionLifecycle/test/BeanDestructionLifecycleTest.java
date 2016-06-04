package _18.beanDestructionLifecycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _18.beanDestructionLifecycle.model.BeanDestructionLifecycleWriter;

public class BeanDestructionLifecycleTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("18.beanDestruction.lifecycle.xml");

		BeanDestructionLifecycleWriter beanDestruction = ctx.getBean("lifecycle",
				BeanDestructionLifecycleWriter.class);

		System.out.println(beanDestruction);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
