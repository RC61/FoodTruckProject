package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String nameId;
	private String foodType;
	private int foodRating;
	private static int nextTruckId;
	private int uniqueId;

	public String getNameId() {
		return nameId;
	}

	public FoodTruck() {
		uniqueId = nextTruckId++;
	}

	public FoodTruck(String nameId, String foodType, int foodRating) {
		this();
		this.nameId = nameId;
		this.foodType = foodType;
		this.foodRating = foodRating;
//		this.uniqueStaticId = uniqueStaticId;
//		this.uniqueId = uniqueId;
	}

	public int getUniqueStaticId() {
		return nextTruckId;
	}

	public void setUniqueStaticId(int uniqueStaticId) {
		FoodTruck.nextTruckId = uniqueStaticId;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}


	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodRating() {
		return foodRating;
	}

//	public FoodTruck getHighestRating() {
//		return getHighestRating;
//	}

	public void setFoodRating(int foodRating) {
		this.foodRating = foodRating;
	}

	public String getFTData() {
		System.out.println(this.toString());
		String output = "Check it out";
		return output;
	}

	@Override
	public String toString() {
		return "FoodTruck: " + nameId + "\t foodType: " + foodType + "\t foodRating: " + foodRating;
	}

	public void displayFoodTruck() {

	}

	// TODO Auto-generated method stub

}
