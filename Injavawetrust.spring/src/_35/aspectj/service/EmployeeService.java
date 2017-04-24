package _35.aspectj.service;

import java.util.List;

public class EmployeeService {

	public void saveEmployee() {
		// AuditServiceAspect#logBefore will be invoked "before"
		System.out.println("saveEmployee is invoked...");
	}

	public void updateEmployee() {
		// AuditServiceAspect#logAfter will be invoked "after"
		System.out.println("updateEmployee is invoked...");
	}

	public String getEmployeeId() {
		// AuditServiceAspect#logAfterReturning will be invoked "after-returning"
		System.out.println("getEmployeeId is invoked...");
		return "Emp-1000";
	}

	public void deleteEmployee() {
		// AuditServiceAspect#logAfterThrowing will be invoked "after-throwing"
		System.out.println("deleteEmployee is invoked...");
		throw new RuntimeException();
	}

	public List<Object> getAllEmployees() {
		// AuditServiceAspect#logAround will be invoked "after-throwing"
		System.out.println("getAllEmployees is invoked...");
		//
		return null;
	}
}
