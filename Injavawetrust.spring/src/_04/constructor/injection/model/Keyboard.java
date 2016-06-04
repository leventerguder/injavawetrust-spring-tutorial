package _04.constructor.injection.model;

public class Keyboard {

	private String model;

	public Keyboard() {

	}

	public Keyboard(String model) {
		super();
		this.model = model;
	}

	@Override
	public String toString() {
		return "Keyboard [model=" + model + "]";
	}

}
