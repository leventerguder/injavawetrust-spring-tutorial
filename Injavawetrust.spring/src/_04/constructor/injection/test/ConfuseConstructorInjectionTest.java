package _04.constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _04.constructor.injection.model.ConstructorConfuse;

public class ConfuseConstructorInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("04.appcontext.constructor.injection.xml");

		ConstructorConfuse confuse = ctx.getBean("constructorConfuseId", ConstructorConfuse.class);
		ConstructorConfuse confuse2 = ctx.getBean("constructorConfuseId2", ConstructorConfuse.class);

		System.out.println(confuse);
		System.out.println(confuse2);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
