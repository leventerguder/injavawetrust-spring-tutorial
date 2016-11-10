package _35.aspectj.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _35.aspectj.model.UserData;
import _35.aspectj.service.TransactionEngineService;

public class AspectJTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("35.aspectj.xml");

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
