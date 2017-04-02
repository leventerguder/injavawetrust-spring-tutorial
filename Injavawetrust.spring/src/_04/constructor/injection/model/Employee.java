package _04.constructor.injection.model;

public class Employee {
	
	private String name;
	private String surname;
	private long salary;
	private int birthYear;
	private char gender;

	public Employee(String name, String surname, long salary, int birthYear, char gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.birthYear = birthYear;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", salary=" + salary + ", birthYear=" + birthYear
				+ ", gender=" + gender + "]";
	}

}
