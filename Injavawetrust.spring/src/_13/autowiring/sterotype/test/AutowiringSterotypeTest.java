package _13.autowiring.sterotype.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _13.autowiring.stereotype.model.Employee;
import _13.autowiring.stereotype.service.EmployeeService;

public class AutowiringSterotypeTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("13.autowiring.sterotype.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		Employee employee = ctx.getBean("employee", Employee.class);			
		employeeService.insertEmployee(employee);
		
		((ClassPathXmlApplicationContext) ctx).close();
		
	}
}
