package _03.setter.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _03.setter.injection.model.Computer;
import _03.setter.injection.model.Employee;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("03.appcontext.setter.injection.xml");
		Employee employee = ctx.getBean("empId", Employee.class);
		Employee employee2 = ctx.getBean("empId2", Employee.class);

		System.out.println(employee);
		System.out.println(employee2);
		
		Computer computer = ctx.getBean("computerId", Computer.class);
		System.out.println(computer);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
