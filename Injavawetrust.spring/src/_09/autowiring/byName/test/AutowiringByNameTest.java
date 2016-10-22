package _09.autowiring.byName.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _09.autowiring.byName.model.Employee;

public class AutowiringByNameTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("09.autowiring.byName.xml");

		Employee employee = ctx.getBean("employeeId", Employee.class);
		System.out.println(employee);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
