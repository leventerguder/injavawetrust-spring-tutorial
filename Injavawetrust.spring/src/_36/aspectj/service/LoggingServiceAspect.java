package _36.aspectj.service;

public class LoggingServiceAspect {

	public void logger(Exception exception) {
		System.out.println("LoggingServiceAspect#logger is invoked...");
		System.out.println(exception);
	}

}
