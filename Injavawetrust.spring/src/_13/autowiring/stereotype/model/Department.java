package _13.autowiring.stereotype.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
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
