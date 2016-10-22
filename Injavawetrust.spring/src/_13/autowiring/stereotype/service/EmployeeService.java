package _13.autowiring.stereotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _13.autowiring.stereotype.model.Employee;

@Service
// default olarak value sinif ismi ile aynidir camelCase yapida olur.
// @Service(value="employeeServiceId")
public class EmployeeService {

	@Autowired
	// @Autowired annotation icin setter metoda ihtiyac yoktur. reflection
	// kullanilarak set edilir.
	private EmployeeDAO employeeDAO;

	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeService - insertEmployee");
		employeeDAO.insertEmployee(employee);
	}

	// employee service methods
}
