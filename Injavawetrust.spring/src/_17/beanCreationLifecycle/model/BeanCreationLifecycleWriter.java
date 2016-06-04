package _17.beanCreationLifecycle.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class BeanCreationLifecycleWriter implements InitializingBean {

	private String property1;

	public String getProperty1() {
		return property1;
	}
	
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	
	@PostConstruct
	public void postConstructTestMethod() {
		System.out.println("PostConstruct...");
	}
	
	@PostConstruct
	public void postConstructTestMethod2() {
		System.out.println("PostConstruct 2...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet... ");
	}
	

	public void initTestMethod() {
		System.out.println("initializing...");
	}

	@Override
	public String toString() {
		return "BeanCreationLifecycleWriter [property1=" + property1 + "]";
	}

}
