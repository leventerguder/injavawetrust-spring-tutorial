package _14.autowiring.jsr330.service;

import javax.inject.Inject;
import javax.inject.Named;

import _14.autowiring.jsr330.dao.EmployeeDAO;
import _14.autowiring.jsr330.model.Employee;

@Named
public class EmployeeServiceImpl implements EmployeeService {

	@Inject
	private EmployeeDAO employeeDAO;

	@Override
	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeServiceImpl - insertEmployee");
		employeeDAO.insertEmployee(employee);
	}

	// more methods can be added.
}