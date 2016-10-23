package _14.autowiring.jsr330.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _14.autowiring.jsr330.model.Employee;


public class AutowiringJSR330Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("14.autowiring.jsr330.xml");	
		
		Employee employee = ctx.getBean("employeeId", Employee.class);				
		System.out.println(employee);
		
		((ClassPathXmlApplicationContext) ctx).close();
		
	}
}
