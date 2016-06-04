package _16.springAwareness.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringAwarenessWriter implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware {

	private String beanName;

	// BeanNameAware
	@Override
	public void setBeanName(String name) {
		System.out.println("Setting name...");
		this.beanName = name;
	}

	public void log() {
		System.out.println("Bean[" + beanName + "] information log...");
	}

	// BeanClassLoaderAware
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("class loader:" + classLoader.getClass());

	}
	// ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext");
		System.out.println(applicationContext.getDisplayName());
	}

}
