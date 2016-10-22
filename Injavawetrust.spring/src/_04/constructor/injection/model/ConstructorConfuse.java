package _04.constructor.injection.model;

public class ConstructorConfuse {

	private String strProperty;
	private int intProperty;

	public ConstructorConfuse(String strProperty) {
		super();
		this.strProperty = strProperty;
	}

	public ConstructorConfuse(int intProperty) {
		super();
		this.intProperty = intProperty;
	}

	@Override
	public String toString() {
		return "ConstructorConfuse [strProperty=" + strProperty + ", intProperty=" + intProperty + "]";
	}

}
