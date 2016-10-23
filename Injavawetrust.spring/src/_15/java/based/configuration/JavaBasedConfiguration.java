package _15.java.based.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import _15.java.based.model.Employee;

@Configuration
@PropertySource(value = "classpath:15.java.based.properties")
@ComponentScan(basePackages = "_15.java.based.model")
@ImportResource(value = "classpath:15.java.based.xml")
public class JavaBasedConfiguration {

	@Autowired
	Environment environment;

	@Bean
	@Lazy(value=true)
	public Employee getEmployee() {
		String name = environment.getProperty("name");
		String surname = environment.getProperty("surname");
		return new Employee(name, surname);
	}

}
