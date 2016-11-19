package _37.aspectj.annotation.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _37.aspectj.annotation.service.EmployeeService;

public class AspectJAnnotationTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("37.aspectj.annotation.xml");

		EmployeeService employeeService = context.getBean(EmployeeService.class);

		// @Before
		employeeService.saveEmployee();

		// @After
		System.out.println();
		employeeService.updateEmployee();

		// @AfterReturning
		System.out.println();
		employeeService.getEmployeeId();

		System.out.println();
		// @AfterThrowing
		try {
			employeeService.deleteEmployee();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println();
		// @AfterAround
		employeeService.getAllEmployees();

		context.close();
	}
}
