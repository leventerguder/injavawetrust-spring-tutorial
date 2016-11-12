package _13.autowiring.stereotype.dao;

import org.springframework.stereotype.Repository;

import _13.autowiring.stereotype.model.Employee;

@Repository
// default olarak value sinif ismi ile aynidir camelCase yapida olur.
// @Repository(value="employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {

	// dao methods

	@Override
	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeDAOImpl - insertEmployee");
		System.out.println(employee);
	}
}