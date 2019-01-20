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

	public void longestRange() {

	}

	public void loadAllCargoJets() {

	}

	public void Dogfight() {

	}

	public void addJet() {
		System.out.println("If you want to add a jet please do this ");
		System.out.println();

	}
	
	public void dogFight() {
		
	}

}
