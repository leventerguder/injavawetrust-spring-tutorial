package _13.autowiring.stereotype.service;

import org.springframework.stereotype.Repository;

import _13.autowiring.stereotype.model.Employee;

@Repository
public class EmployeeDAO {

	// dao methods

	public void insertEmployee(Employee employee) {
		System.out.println("inserted to db...");
		System.out.println(employee);
	}
}
