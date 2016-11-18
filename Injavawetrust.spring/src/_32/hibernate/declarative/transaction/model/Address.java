package _32.hibernate.declarative.transaction.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int addressId;
	private String street;
	private String zipcode;
	private String city;

	public Address() {
		super();
	}

	public Address(int addressId, String street, String zipcode, String city) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", zipcode=" + zipcode + ", city=" + city
				+ "]";
	}

}
