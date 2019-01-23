package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	Jet[] jets = new Jet[10];
	Scanner kb = new Scanner(System.in);

	// Array of jet objects
	public AirField() {
		jets[0] = new FighterJet("F-16", 900.00, 2000.00, 1_000_000);
		jets[1] = new FighterJet("Sukhou Su-27", 900.00, 2000.00, 1_000_000);
		jets[2] = new FighterJet("EuroFighter Typhoon", 900.00, 2000.00, 1_000_000);
		jets[3] = new FighterJet("F-22", 9100.00, 2000.00, 900.00);
		jets[4] = new CargoPlane("Antonov An-225 Mriya", 900.00, 2000.00, 1_000_000);
		jets[5] = new CargoPlane("747", 900.00, 3000.00, 1_000_000);

	}

	public void fly() {
		System.out.println("We are about to make all jets fly");
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			} else {
				System.out.println(jets[i].getModel() + " Is in the air");

			}
		}
	}

	public void viewFastestJet() {
		double topSpeed = 0.0;
		Jet fastestJet = null;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i].getSpeed() > topSpeed) {
				topSpeed = jets[i].getSpeed();
				fastestJet = jets[i];
			}
		}

		System.out.println("The fastest is " + fastestJet.getModel() + "The speed is " + topSpeed);

	}

	public void listFleet() {
		System.out.println("Here is a list of the fleet");
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].getModel());
			} else if (jets[i] == null) {
				break;
			}
		}

	}

	public void viewLongestRange() {
		double range = 0.0;
		Jet longestRange = null;

	}

	public void loadAllCargoJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null && jets[i] instanceof CargoPlane) {
				CargoPlane newCargo = (CargoPlane) jets[i];
				newCargo.loadCargo();
			} else if (jets[i] == null) {
				break;
			}
		}
	}

	public void dogFight() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null && jets[i] instanceof FighterJet) {
				FighterJet newFighter = (FighterJet) jets[i];
				newFighter.doBattle();
			} else if (jets[i] == null) {
				break;
			}
		}
		System.out.println("All Jets are doing battle");
	}

	public void addJet() {
		String model;
		double speed;
		double range;
		double price;

		System.out.println("If you want to add a new jet please follow the instructions below");
		System.out.println("Enter the model of the jet");
		model = kb.next();
		System.out.println("Enter the speed of the jet");
		speed = kb.nextDouble();
		System.out.println("Enter the range of the jet");
		range = kb.nextDouble();
		System.out.println("Enter the price of the jet");
		price = kb.nextDouble();

		Jet newJet1 = new JetImpl(model, speed, range, price);

		for (int i = 0; i < jets.length - 1; i++) {
			if (jets[i] == null) {
				jets[i] = newJet1;
				break;
			}
		}
	}

}
