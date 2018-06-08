package com.example.collections;

public class Fibnoci {

	public static void main(String args[]) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(getFibonacci(i));
		}
	}

	static int getFibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
}
