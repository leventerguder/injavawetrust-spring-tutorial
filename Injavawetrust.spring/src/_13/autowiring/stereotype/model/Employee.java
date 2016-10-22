package _13.autowiring.stereotype.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//default olarak value sinif ismi ile aynidir camelCase yapida olur.
//@Component(value="employee")
public class Employee {

	@Value(value = "Levent")
	private String name;
	@Value(value = "Erguder")
	private String surname;
	private Department department;

	@Autowired
	public Employee(Department department) {
		this.department = department;
	}

	@Autowired
	private Address address;

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
		return "Employee [name=" + name + ", surname=" + surname + ", department=" + department + ", address="
				+ address + "]";
	}

}
