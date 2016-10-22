package _03.setter.injection.model;

public class Keyboard {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Keyboard [model=" + model + "]";
	}

}
