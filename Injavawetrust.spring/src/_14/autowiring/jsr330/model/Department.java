package _14.autowiring.jsr330.model;

import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class Department {

	@Resource(name = "departmentId")
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + "]";
	}

}
