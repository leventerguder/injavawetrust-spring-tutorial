package _35.aspectj.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AuditServiceAspect {

	public void logBefore() {
		System.out.println("logBefore is invoked...");
	}

	public void logAfter() {
		System.out.println("logAfter is invoked...");
	}

	public void logAfterReturning(JoinPoint joinPoint, String resultValue) {
		System.out.println("logAfterReturning is invoked...");
		System.out.println("Called by : " + joinPoint.getSignature().getName());
		System.out.println("Returned value : " + resultValue);
	}

	public void logAfterThrowing(JoinPoint joinPoint, Exception thrownException) {

		System.out.println("logAfterThrowing is invoked...");
		System.out.println("Called by  : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + thrownException);

	}

	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround is invoked...");
		System.out.println("Called by : " + joinPoint.getSignature().getName());
		System.out.println("Around before is running!");

		joinPoint.proceed();

		System.out.println("Around after is running!");
		
	}

}
