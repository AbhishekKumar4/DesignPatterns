package com.abhishek.prototype;

class Bike implements Cloneable {
	private int gears;
	private String bikeType;
	private String model;

	public Bike() {
		bikeType = "Royal Enfield";
		model = "Classic 350";
		gears = 4;
	}

	public Bike clone() {
		Bike bike = null;
		try {
			bike = (Bike) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return bike;
	}

	public void makeAdvanced() {
		bikeType = "Hayabusa";
		model = "1100";
		gears = 6;
	}

	public String getModel() {
		return model;
	}
}
