package com.example.collections;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(3));
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
