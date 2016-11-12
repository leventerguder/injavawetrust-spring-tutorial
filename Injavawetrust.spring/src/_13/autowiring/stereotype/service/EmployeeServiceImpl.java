package _13.autowiring.stereotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _13.autowiring.stereotype.dao.EmployeeDAO;
import _13.autowiring.stereotype.model.Employee;

@Service
// default olarak value sinif ismi ile aynidir camelCase yapida olur.
// @Service(value="employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired	
	// @Autowired annotation icin setter metoda ihtiyac yoktur. reflection
	// kullanilarak set edilir.
	private EmployeeDAO employeeDAO;

	@Override
	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeServiceImpl - insertEmployee");
		employeeDAO.insertEmployee(employee);
	}

	// more methods can be added.
}