package _36.aspectj.annotation.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _36.aspectj.annotation.service.EmployeeService;

public class AspectJAnnotationTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("36.aspectj.annotation.xml");

		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.saveEmployee();
		
		employeeService.updateEmployee();
		
		employeeService.getEmployeeId();
		
		employeeService.deleteEmployee();
		
		employeeService.getAllEmployees();
		
		context.close();
	}
}
