package _15.java.based.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _15.java.based.configuration.JavaBasedConfiguration;
import _15.java.based.model.Employee;

public class JavaBasedConfigurationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);		
		Employee employee = ctx.getBean( Employee.class);				
		System.out.println(employee);
		
		((AnnotationConfigApplicationContext) ctx).close();
		
	}
}
