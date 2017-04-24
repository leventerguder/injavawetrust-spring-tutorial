package _35.aspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _35.aspectj.service.EmployeeService;

public class AspectJTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("35.aspectj.xml");

		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		// aop:before
		employeeService.saveEmployee();

		System.out.println();

		// aop:after
		employeeService.updateEmployee();

		System.out.println();

		// aop:after-returning
		employeeService.getEmployeeId();

		System.out.println();

		// aop:after-throwing
		try {
			employeeService.deleteEmployee();
		} catch (Exception e) {

		}

		System.out.println();

		// aop:around
		employeeService.getAllEmployees();
		
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
