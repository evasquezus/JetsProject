package com.skilldistillery.jets;

public class CargoPlane extends Jets implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price, double speedInMatch) {
		super(model, speed, range, price, speedInMatch);
	}

}
