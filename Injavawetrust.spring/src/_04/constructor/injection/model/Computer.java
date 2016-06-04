package _04.constructor.injection.model;

public class Computer {

	private String brand;
	private int price;
	private Keyboard keyboard;

	public Computer() {

	}

	public Computer(String brand, int price, Keyboard keyboard) {
		super();
		this.brand = brand;
		this.price = price;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + ", keyboard=" + keyboard + "]";
	}
}
