package _06.spel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("personIdAnnotation")
public class PersonAnnotation {
	
	@Value("#{configIdAnnotation.name}")
	private String name;
	
	@Value("#{configIdAnnotation.surname}")
	private String surname;
	
	@Value("#{configIdAnnotation.gender}")
	private char gender;
	
	@Value("#{configIdAnnotation.birthYear}")
	private int birthYear;

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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthYear=" + birthYear
				+ "]";
	}

}
