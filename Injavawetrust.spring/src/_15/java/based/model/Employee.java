package _15.java.based.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String name;
	private String surname;

	@Autowired
	private Address address;

	@Autowired
	private Department department;

	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", address=" + address + ", department="
				+ department + "]";
	}

}
