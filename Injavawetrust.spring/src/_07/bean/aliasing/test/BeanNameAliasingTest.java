package _07.bean.aliasing.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _07.bean.aliasing.model.Person;

public class BeanNameAliasingTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("07.bean.aliasing.xml");

		Person person1 = ctx.getBean("name1", Person.class);
		Person person2 = ctx.getBean("name2", Person.class);
		Person person3 = ctx.getBean("name3", Person.class);
		Person person4 = ctx.getBean("name4", Person.class);
		Person person5 = ctx.getBean("name5", Person.class);
		Person person6 = ctx.getBean("name6", Person.class);

		System.out.println((person1 == person2));
		System.out.println((person2 == person3));
		System.out.println((person3 == person4));
		System.out.println((person4 == person5));
		System.out.println((person5 == person6));

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
