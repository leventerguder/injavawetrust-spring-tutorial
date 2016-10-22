package _11.autowiring.constructor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _11.autowiring.constructor.model.Employee;

public class AutowiringConstructorTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("11.autowiring.constructor.xml");

		Employee employee = ctx.getBean("employeeId", Employee.class);
		System.out.println(employee);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
