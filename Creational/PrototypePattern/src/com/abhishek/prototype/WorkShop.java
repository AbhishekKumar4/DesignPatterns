package com.abhishek.prototype;

public class WorkShop {

	public Bike makeHayabusa(Bike basic) {
		basic.makeAdvanced();
		return basic;
	}

	public static void main(String args[]) {
		Bike bb = new Bike();
		Bike basic = bb.clone();

		WorkShop work = new WorkShop();
		Bike advanced = work.makeHayabusa(basic);
		System.out.println("Prototype Design Pattern: " + advanced.getModel());
	}
}
