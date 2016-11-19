package _36.aspectj.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _36.aspectj.model.UserData;
import _36.aspectj.service.TransactionEngineService;

public class AspectJTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("36.aspectj.xml");

		TransactionEngineService transactionEngineService = context.getBean("transactionEngineService",
				TransactionEngineService.class);

		UserData userData = new UserData();

		try {
			transactionEngineService.processTransaction(userData);
		} catch (Exception e) {
			System.out.println("AspectJTest#main");
		}

		context.close();
	}
}
