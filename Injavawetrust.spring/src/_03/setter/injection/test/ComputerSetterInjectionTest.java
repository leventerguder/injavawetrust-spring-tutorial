package _03.setter.injection.test;

import org.springframework.context.support.GenericXmlApplicationContext;
import _03.setter.injection.model.Computer;

public class ComputerSetterInjectionTest {

	public static void main(String[] args) {

		// Instead of DefaultListableBeanFactory, an instance of
		// GenericXmlApplicationContext is instantiated.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:03.appcontext.setter.injection.xml");
		ctx.refresh();

		Computer computer = ctx.getBean("computerId", Computer.class);
		System.out.println(computer);

		ctx.close();

	}
}