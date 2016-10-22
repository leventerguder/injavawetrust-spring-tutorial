package _13.autowiring.stereotype.service;

import org.springframework.stereotype.Repository;

import _13.autowiring.stereotype.model.Employee;

@Repository
// default olarak value sinif ismi ile aynidir camelCase yapida olur.
// @Repository(value="employeeDAO")
public class EmployeeDAO {

	// dao methods

	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeDAO - insertEmployee");
		System.out.println(employee);
	}
}
