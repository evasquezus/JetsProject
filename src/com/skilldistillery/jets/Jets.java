package com.skilldistillery.jets;

public abstract class Jets {


	private String model;
	private double speed;
	private double speedInMatch;
	private int range;
	private long price;

	public Jets(String model, double speed, int range, long price, double speedInMatch) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.speedInMatch = speedInMatch;
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
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	

}
