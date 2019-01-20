package com.skilldistillery.jets;

public abstract class Jets {

	private String model;
	private double speed;
	private double speedInMatch;
	private int range;
	private double price;

	public Jets(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
	}
	
	public Jets(String model2, double speed2, double range2, double price2) {
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("is currently flying");
	}
	
	public double speedInMatch() {
		double speed = 500;
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

	public double getSpeedInMatch() {
		return speedInMatch;
	}

	public void setSpeedInMatch(double speedInMatch) {
		this.speedInMatch = speedInMatch;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return (long) price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
