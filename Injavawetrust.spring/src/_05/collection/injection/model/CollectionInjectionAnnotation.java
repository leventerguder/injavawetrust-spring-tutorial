package _05.collection.injection.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("collectionInjectionAnnotation")
public class CollectionInjectionAnnotation {

	@Resource(name = "myAnnotationList")
	private List<String> myList;

	@Resource(name = "myAnnotationPersonList")
	private List<Person> personList;

	@Resource(name = "myAnnotationSet")
	private Set<Integer> mySet;

	@Resource(name = "myAnnotationMap")
	private Map<String, Object> myMap;

	@Resource(name = "myAnnotationProperties")
	private Properties myProperties;

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Set<Integer> getMySet() {
		return mySet;
	}

	public void setMySet(Set<Integer> mySet) {
		this.mySet = mySet;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}

	public Map<String, Object> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}
}
