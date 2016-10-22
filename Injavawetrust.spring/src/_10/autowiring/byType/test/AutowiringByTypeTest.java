package _10.autowiring.byType.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _10.autowiring.byType.model.Employee;

public class AutowiringByTypeTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("10.autowiring.byType.xml");

		Employee employee = ctx.getBean("employeeId", Employee.class);
		System.out.println(employee);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
