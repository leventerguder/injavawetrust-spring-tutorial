package _05.collection.injection.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _05.collection.injection.model.CollectionInjection;
import _05.collection.injection.model.Person;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("05.collection.injection.xml");

		CollectionInjection collectionInjection = ctx.getBean("collectionId", CollectionInjection.class);

		List<String> myList = collectionInjection.getMyList();
		List<Person> myPerson = collectionInjection.getPersonList();
		Set<Integer> mySet = collectionInjection.getMySet();
		Map<String, Object> myMap = collectionInjection.getMyMap();
		Properties myProperties = collectionInjection.getMyProperties();

		System.out.println("myList elements : ");
		// for (String element : myList) {
		// System.out.println(element);
		// }

		// java8
		myList.stream().forEach(System.out::println);

		System.out.println("myPerson elements : ");
		// for (Person element : myPerson) {
		// System.out.println(element);
		// }

		// java8
		myPerson.stream().forEach(System.out::println);

		System.out.println("mySet elements : ");
		// for (Integer element : mySet) {
		// System.out.println(element);
		// }

		// java8
		mySet.forEach(System.out::println);

		System.out.println("myMap elements : ");
		// for (Object element : myMap.keySet()) {
		// System.out.println(myMap.get(element));
		// }

		// java8
		myMap.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

		System.out.println("myProperties elements : ");
		// for (Map.Entry<Object, Object> entry : myProperties.entrySet()) {
		// System.out.println(entry.getKey() + " " + entry.getValue());
		// }

		// java8
		myProperties.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
