package _13.autowiring.stereotype.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//default olarak value sinif ismi ile aynidir camelCase yapida olur.
//@Component(value="address")
public class Address {

	@Value(value="Istanbul")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
