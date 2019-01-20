package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	Jets[] jets = new Jets[10];
	Scanner kb = new Scanner(System.in);

	public void fly() {
		System.out.println("We are about to make all jets fly");
		for (int i = 0; i < jets.length; i++) {
		}
	}

	public void viewFastestJet() {

	}

	public void listFleet() {
		System.out.println("Here is a list of the fleet");
		for (int i = 0; i < jets.length; i++) {
			System.out.println(jets[i]);
		}

	}

	public void viewLongestRange() {
	}

	public void loadAllCargoJets() {
	}

	public void dogFight() {
	}

	public void addJet() {

	}

}
