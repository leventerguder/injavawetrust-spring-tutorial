package _36.aspectj.annotation.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuditServiceAspect {

	@Before("execution(* _36.aspectj.annotation.service.EmployeeService.saveEmployee(..))")
	public void logBefore() {
		System.out.println("logBefore is invoked...");
	}

	@After("execution(* _36.aspectj.annotation.service.EmployeeService.updateEmployee(..))")
	public void logAfter() {
		System.out.println("logAfter is invoked...");
	}

	@AfterReturning(pointcut = "execution(* _36.aspectj.annotation.service.EmployeeService.getEmployeeId(..))", returning = "resultValue")
	public void logAfterReturning(JoinPoint joinPoint, String resultValue) {
		System.out.println("logAfterReturning is invoked...");
		System.out.println("Called by : " + joinPoint.getSignature().getName());
		System.out.println("Returned value : " + resultValue);
	}

	@AfterThrowing(pointcut="execution(* _36.aspectj.annotation.service.EmployeeService.deleteEmployee(..))" ,throwing="thrownException")
	public void logAfterThrowing(JoinPoint joinPoint, Exception thrownException) {

		System.out.println("logAfterThrowing is invoked...");
		System.out.println("Called by  : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + thrownException);

	}

	@Around("execution(* _36.aspectj.annotation.service.EmployeeService.getAllEmployees(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround is invoked...");
		System.out.println("Called by : " + joinPoint.getSignature().getName());
		System.out.println("Around before is running!");

		joinPoint.proceed();

		System.out.println("Around after is running!");

	}

}
