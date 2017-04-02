package _04.constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import _04.constructor.injection.model.Employee;

public class EmployeeConstructorInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("04.appcontext.constructor.injection.xml");
		Employee employee = ctx.getBean("empId", Employee.class);
		Employee employee2 = ctx.getBean("empId2", Employee.class);

		System.out.println(employee);
		System.out.println(employee2);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
