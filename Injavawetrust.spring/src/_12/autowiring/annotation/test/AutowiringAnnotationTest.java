package _12.autowiring.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _12.autowiring.annotation.model.Employee;

public class AutowiringAnnotationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("12.autowiring.annotation.xml");

		Employee employee = ctx.getBean("employeeId", Employee.class);
		System.out.println(employee);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
