package _36.aspectj.service;

import _36.aspectj.exception.ExceptionMessages;
import _36.aspectj.exception.UserDataException;
import _36.aspectj.model.UserData;

public class UserAuthenticator {

	public void authenticateUser(UserData userData) throws UserDataException {

		if (userData == null) {
			throw new UserDataException(ExceptionMessages.INVALID_USER_DATA);
		}

		if (userData.isLocked()) {
			throw new UserDataException(ExceptionMessages.USER_LOCKED);
		}

		if (userData.getTryCount() > 5) {
			userData.setLocked(true);
		}

		///
		boolean hasPermission = checkPermission(1000);

		if (!hasPermission) {
			throw new UserDataException(ExceptionMessages.USER_NOT_PERMITTED);
		}

		//
		// more logic about authetication

	}

	public boolean checkPermission(int permissionId) {
		///
		// check permission
		//
		return true;

	}
}
