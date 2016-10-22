package _06.spel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _06.spel.model.PersonAnnotation;

public class SpELAnnotationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("06.spel.annotation.xml");

		PersonAnnotation personAnnotationBean = ctx.getBean("personIdAnnotation", PersonAnnotation.class);
		System.out.println(personAnnotationBean);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
