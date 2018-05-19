package com.abhishek.singleton;

public class SingletonPattern {

	private static SingletonPattern single;

	private SingletonPattern() {
	}

	public static SingletonPattern getSingleInstance() {
		if (single == null) {
			synchronized (SingletonPattern.class) {
				if (single == null) {
					single = new SingletonPattern();
				}
			}
		}
		return single;
	}

	public static void main(String args[]) {
		System.out.println("The output of two instances");
		System.out.println("======================");
		Thread t1 = new Thread(
				() -> System.out.println("Output from first instance:" + SingletonPattern.getSingleInstance()));

		Thread t2 = new Thread(
				() -> System.out.println("Output from second instance:" + SingletonPattern.getSingleInstance()));

		t1.start();
		t2.start();
	}
}
