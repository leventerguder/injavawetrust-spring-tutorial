package _01.decoupled.test;

import _01.decoupled.model.Car;
import _01.decoupled.model.GoodYear;
import _01.decoupled.model.Lassa;
import _01.decoupled.model.Vehicle;
import _01.decoupled.model.Wheel;

public class DecoupledTest {

	public static void main(String[] args) {
		Vehicle car = new Car();

		Wheel lassaTire = new Lassa();
		car.setWheel(lassaTire);

		car.goAhead();

		Wheel goodYearTire = new GoodYear();
		car.setWheel(goodYearTire);

		car.goAhead();
	}
}
