package _35.aspectj.service;

import _35.aspectj.exception.UserDataException;
import _35.aspectj.model.UserData;

public class UserAuthenticatorAspect {

	public void authenticateBefore(UserData userData) {

		System.out.println("UserAuthenticatorAspect#authenticateBefore is invoked...");

		UserAuthenticator authenticator = new UserAuthenticator();
		try {
			authenticator.authenticateUser(userData);
		} catch (UserDataException e) {
			System.out.println("Exception caught!");
			System.out.println(e.getErrorMessage());

		}
	}
}
