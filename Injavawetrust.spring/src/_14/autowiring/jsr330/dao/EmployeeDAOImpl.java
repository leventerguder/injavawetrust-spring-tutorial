package _14.autowiring.jsr330.dao;

import javax.inject.Named;
import _14.autowiring.jsr330.model.Employee;

@Named
public class EmployeeDAOImpl implements EmployeeDAO {

	// dao methods

	@Override
	public void insertEmployee(Employee employee) {
		System.out.println("EmployeeDAOImpl - insertEmployee");
		System.out.println(employee);
	}
}