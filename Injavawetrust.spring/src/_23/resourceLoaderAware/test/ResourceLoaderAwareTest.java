package _23.resourceLoaderAware.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import _23.resourceLoaderAware.service.ResourceLoaderService;

public class ResourceLoaderAwareTest {

	public static void main(String[] args) throws IOException {

		// configuration file is not necessary. we didnt define bean.
		ApplicationContext ctx = new ClassPathXmlApplicationContext();

		ResourceLoaderService resourceLoaderService = ctx.getBean("resourceLoaderService", ResourceLoaderService.class);
		ResourceLoader resourceLoader = resourceLoaderService.getResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:23.test.txt");

		System.out.println(resource.getURL());

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
