package _09.autowiring.byName.model;

public class Employee {

	private String name;
	private String surname;
	private Address addressByName;

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

	public Address getAddressByName() {
		return addressByName;
	}

	public void setAddressByName(Address addressByName) {
		this.addressByName = addressByName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", addressByName=" + addressByName + "]";
	}

}
