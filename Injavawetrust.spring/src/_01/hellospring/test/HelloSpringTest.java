package _01.hellospring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.hellospring.model.Car;

public class HelloSpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("01.appcontext.xml");		
		Car car = ctx.getBean("carId", Car.class);
		car.goAhead();

		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
