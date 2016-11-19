package _36.aspectj.service;

import _36.aspectj.model.UserData;

public class TransactionEngineService {

	public void processTransaction(UserData userData) {

		// business logic	
		System.out.println("processTransaction is invoked...");
		//
		//

		throw new RuntimeException();

	}
}
