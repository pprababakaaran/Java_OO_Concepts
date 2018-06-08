package com.example.upcasting;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class Splender extends Bike {
	void run() {
		System.out.println("running safely with 60km");
	}
}

public class Upcasting {

	public static void main(String args[]) {
		Bike upcasting = new Splender();// upcasting
		upcasting.run();
		
		Splender downcasting = (Splender)new Bike();// downcasting
		downcasting.run();
	}

}
