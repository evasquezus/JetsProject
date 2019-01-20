package com.skilldistillery.jets;

public class FighterJet extends Jets implements CombatReady{

	public FighterJet(String model, double speed, int range, long price, double speedInMatch) {
		super(model, speed, range, price);
	
	}

	@Override
	public void doBattle() {
		System.out.println(this.getModel() + "starts to attack enemy");
		
	}

	
}
