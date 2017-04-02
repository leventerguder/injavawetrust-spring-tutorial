package _04.constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _04.constructor.injection.model.Computer;

public class CoputerConstructorInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("04.appcontext.constructor.injection.xml");
		Computer computer = ctx.getBean("computerId", Computer.class);
		System.out.println(computer);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
