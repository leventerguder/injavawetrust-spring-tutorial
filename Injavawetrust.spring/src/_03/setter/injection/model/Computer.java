package _03.setter.injection.model;

public class Computer {

	private String brand;
	private int price;
	private Keyboard keyboard;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + ", keyboard=" + keyboard + "]";
	}
}
