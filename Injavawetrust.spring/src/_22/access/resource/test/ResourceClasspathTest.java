package _22.access.resource.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceClasspathTest {

	public static void main(String[] args) throws IOException {

		// configuration file is not necessary. we didnt define bean.
		ApplicationContext ctx = new ClassPathXmlApplicationContext();

		Resource resource = ctx.getResource("classpath:22.test.properties");
		InputStream is = resource.getInputStream();

		Properties prop = new Properties();
		prop.load(is);

		String name = prop.getProperty("name");

		System.out.println(name);

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
