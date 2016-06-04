package _04.constructor.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _04.constructor.injection.model.Computer;
import _04.constructor.injection.model.ConstructorConfuse;
import _04.constructor.injection.model.Employee;


public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("04.appcontext.constructor.injection.xml");
		Employee employee = ctx.getBean("empId", Employee.class);
		Employee employee2 = ctx.getBean("empId2", Employee.class);

		System.out.println(employee);
		System.out.println(employee2);
		
		ConstructorConfuse confuse = ctx.getBean("constructorConfuseId", ConstructorConfuse.class);
		ConstructorConfuse confuse2 = ctx.getBean("constructorConfuseId2", ConstructorConfuse.class);

		System.out.println(confuse);
		System.out.println(confuse2);
		
		Computer computer = ctx.getBean("computerId", Computer.class);
		System.out.println(computer);
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
