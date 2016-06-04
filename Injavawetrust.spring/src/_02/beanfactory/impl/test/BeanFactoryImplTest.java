package _02.beanfactory.impl.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import _02.beanfactory.impl.model.Car;

public class BeanFactoryImplTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new ClassPathResource("02.appcontext.xml"));

		// Car car = (Car) factory.getBean(Car.class);
		// <context:component-scan base-package="_02.beanfactory.impl.model" />
		// kullanildiginda
		// @Component olarak Car sinifimizda kullandigimiz icin otomatik olarak
		// Car objesi olusturulur.

		Car car = (Car) factory.getBean("carId");
		System.out.println(car.getBrand());
	}
}
