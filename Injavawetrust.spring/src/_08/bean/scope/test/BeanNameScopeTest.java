package _08.bean.scope.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _08.bean.scope.model.Person;

public class BeanNameScopeTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("08.bean.scope.xml");

		Person person1 = ctx.getBean("name1", Person.class);
		Person person11 = ctx.getBean("name1", Person.class);
		// name1 singleton scope olacak sekilde tanimlidir. getBean metodu
		// kullanildiginda her
		// defasinda ayni instance/obje dondurulecektir.

		Person person2 = ctx.getBean("name2", Person.class);
		Person person22 = ctx.getBean("name2", Person.class);
		// name2 prototype scope tanimlandi. getBean metodu kullanildiginda her
		// defasinda farkli instance/obje dondurulecektir.

		System.out.println("Singleton : " + (person1 == person11));
		System.out.println("Prototype : " + (person2 == person22));

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
