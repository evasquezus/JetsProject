package com.skilldistillery.jets;

public abstract class Jet {

	// Fields
	private String model;
	private double speed;
	private double range;
	private double price;

	// Constructor

	public Jet(String model, double speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;

	}


	public void fly() {
		System.out.println("is currently flying");
	}

	public double speedInMatch() {
		double speed = 0;
		return speed;

	}

	public String outPut() {
		String output = "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price;
		return output;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void getSpeedInMatch() {
		double mach = this.getSpeed() / 760.56;
		if(this.getSpeed() < 760.56) {
			System.out.println((int)mach);
		}
	}

	public void setSpeedInMatch(double speedInMatch) {
		
	}

	public double getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return (long) price;
	}

	public void setPrice(double price) {
		this.price = (long) price;
	}

}
