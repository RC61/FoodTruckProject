package com.skilldistillery.foodtruck;


public class Fleet {
	private int numTrucks;
	private FoodTruck[] trucks;
	private int MAX_TRUCKS = 5;
	public Fleet() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}
	public FoodTruck[] getTrucks() {
		return trucks;
	}
	public void addTruck(FoodTruck newEntry) {
		if (numTrucks == MAX_TRUCKS) {
			System.out.println("Sorry. No more trucks");
			return;
		}
		else {
			for (int spaceNum = 0; spaceNum < MAX_TRUCKS; spaceNum++) {
				if (trucks[spaceNum] == null) {
					trucks[spaceNum] = newEntry;
					
					numTrucks++;
					break;
				}
			}
		}
	}

}
