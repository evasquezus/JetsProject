package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		AirField newAirField = new AirField();
		Scanner kb = new Scanner(System.in);
		System.out.println(">>Welcome to the airfield ");
		boolean outprint = true;
		while (outprint) {
			System.out.println("Pick from the menu below?");
			System.out.println("1>> Fly all jets");
			System.out.println("2>> View fastest jet");
			System.out.println("3>> View jet with longest range");
			System.out.println("4>> Load all Cargo Jets");
			System.out.println("5>> Dogfight!");
			System.out.println("6>> Add a jet to Fleett");
			System.out.println("7>> List all jets in fleet");
			System.out.println("8>> Quit");
			

			int userChoice = kb.nextInt();
			if(userChoice == 8) {
				System.out.println("You have decided to quit..existing");
				break;
			}

			switch (userChoice) {
			case 1:
				newAirField.fly();
			case 2:
				newAirField.viewFastestJet();
			case 3:
				newAirField.viewLongestRange();
			case 4:
				newAirField.loadAllCargoJets();
			case 5:
				newAirField.dogFight();
			case 6:
				newAirField.addJet();
			case 7:
				newAirField.listFleet();
			case 8:
				System.out.println("You have decided to quit..existing");
				break;
			default:
				System.out.println("Please try to pick one of the options listed");

			}

		}
	}
}