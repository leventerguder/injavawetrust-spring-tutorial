package _36.aspectj.exception;

public class UserDataException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorMessage;

	public UserDataException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
