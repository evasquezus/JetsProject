package com.skilldistillery.jets;

import java.awt.DisplayMode;
import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		AirField newAirField = new AirField();
		Scanner kb = new Scanner(System.in);
		// Initial menu popup
		IntroMenu menu = new IntroMenu();
		boolean istrue = true;
		
		while(istrue ) {
			menu.displayMenu();
			int userChoice;
			userChoice = kb.nextInt();
			switch (userChoice) {
			case 1:
				newAirField.listFleet();
				break;
			case 2:
				newAirField.viewFastestJet();
				break;
			case 3:
				newAirField.viewLongestRange();
				break;
			case 4:
				newAirField.loadAllCargoJets();
				break;
			case 5:
				newAirField.dogFight();
				break;
			case 6:
				newAirField.addJet();
				break;
			case 7:
				newAirField.fly();
				break;
			case 8:
				System.out.println("You have decided to quit..existing");
				System.exit(0);
			default:
				System.out.println("Please try to pick one of the options listed");
				break;
			}
		}
	}
}