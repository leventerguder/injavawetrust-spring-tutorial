package _13.autowiring.sterotype.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _13.autowiring.stereotype.model.Employee;
import _13.autowiring.stereotype.service.EmployeeServiceImpl;

public class AutowiringSterotypeTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("13.autowiring.sterotype.xml");

		// employeeServiceImpl is default!
		// employeeServiceImpl , varsayilan olarak camelCase yapida isimlendirme
		// kullanilir.
		// EmployeeServiceImpl sinifinin basinda @Service annotation olduguna
		// dikkat edelim !

		EmployeeServiceImpl employeeService = ctx.getBean("employeeServiceImpl", EmployeeServiceImpl.class);

		// Ayni sekilde Employee sinifinda da @Component olarak annotation
		// kullandik.
		// varsayilan isim ; "employee olacaktir " -->
		// @Component(value="employee")
		Employee employee = ctx.getBean("employee", Employee.class);

		employeeService.insertEmployee(employee);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}