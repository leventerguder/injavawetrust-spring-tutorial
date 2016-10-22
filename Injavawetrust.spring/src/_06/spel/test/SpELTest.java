package _06.spel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _06.spel.model.Person;

public class SpELTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("06.spel.xml");

		Person person = ctx.getBean("personIdXML", Person.class);
		System.out.println(person);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
