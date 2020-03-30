package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

//	User Story #1
//	The user is prompted to input the name, food type, and rating for up to five food trucks.
//	For each set of input, a FoodTruck object is created, its fields set to the user's input,
//	and it is added to the array. The truck id is not input by the user, 
//	but instead assigned automatically in the FoodTruck constructor from a static field 
//	that is incremented as each truck is created.
	FoodTruck[] fleet = new FoodTruck[5];
	FoodTruck inputFT = new FoodTruck();
	Scanner kb = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {
		FoodTruckApplication ftApp = new FoodTruckApplication();
		ftApp.addFoodTrucks();
	}

	public void addFoodTrucks() {

		for (int numTrucks = 0; numTrucks < 5; numTrucks++) {
			System.out.print("Enter the name of a Food Truck: ");
			String name = kb.next();
			System.out.println();
			System.out.print("");
			if (!name.equals("quit")) {
				System.out.print("What kind of food is served: ");
				String type = kb.next();
				System.out.print("");
				System.out.print("What is the truck's rating 1-5: ");
				int rating = kb.nextInt();
				FoodTruck foodTruck = new FoodTruck(name, type, rating);
				fleet[numTrucks] = foodTruck;
			} else {
				break;

			}
		}
		showMenu();

	}

	public void displayTrucks() {
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != (null)) {
				System.out.println(foodTruck.toString());
			}
		}
	}

//After input is complete, the user sees a menu from which they can choose to:
//
//List all existing food trucks.
//See the average rating of food trucks.
//Display the highest-rated food truck.
//Quit the program
	public void showMenu() {
		String input = "";

		while (!input.equals("0")) {
			System.out.println("Welcome to the Food Truck Menu");
			System.out.println("1) List all Food Trucks");
			System.out.println("2) See average rating for Food Trucks");
			System.out.println("3) See highest rated Food Truck");
			System.out.println("0) Quit");
			input = kb.next();
			switch (input) {
			case "1":
				displayTrucks();
				System.out.print("\n");
				break;
			case "2":
				System.out.print("Average rating: ");
				getRatings();
				System.out.println("\n");
				break;
			case "3":
				System.out.println("Highest rated food truck: ");
				getHighest();
				break;
			case "0":
				System.out.println("You have selected menu option 0");
				System.out.println("Exiting program...");
				System.exit(0);
				continue;
			default:
			}

		}

		System.out.println("GOODBYE... but you shouldn't ever get here...");
	}

	public void getRatings() {
		int ratingCount = 0;
		int i = 0;
		for (i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				ratingCount += fleet[i].getFoodRating();
			} else {
				break;
			}
		}
		double average = (double) ratingCount / i;
		System.out.println(average);
	}

	public void getHighest() {
		int max = fleet[0].getFoodRating();
		String high = fleet[0].toString();

		for (int i = 1; i < fleet.length; i++) {

			if (fleet[i] != null) {
				if (max < fleet[i].getFoodRating()) {
					max = fleet[i].getFoodRating();
					high = fleet[i].toString();
				}
			}
		}
		System.out.println(high);
		System.out.println("\n");
	}

}
