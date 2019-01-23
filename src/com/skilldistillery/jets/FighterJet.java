package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{
	
	

	public FighterJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	
	}

	@Override
	public void doBattle() {
		System.out.println(this.getModel() + " starts to attack enemy");
		
	}

	
}
