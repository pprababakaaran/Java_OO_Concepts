package com.javapapers.java;

public class MagicString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MagicString obj = new MagicString();
		int[] zeros = new int[90];
		int[] ones = new int[90];
		obj.after_M_Touches(10, zeros, ones);
	}

	public int after_M_Touches(int m, int[] zerosArr, int[] onesArr) {
		int zeros = 0;
		int ones = 0;
		int iterCount = 1;
		while (m >= iterCount) {
			if (iterCount > 1) {
				int t = zeros;
				zeros = ones + zeros;
				ones = t;
			} else {
				zeros = 0;
				ones = 1;
			}
			zerosArr[iterCount - 1] = zeros;
			onesArr[iterCount - 1] = ones;
			iterCount++;
		}
		System.out.println("iteration: " + iterCount + " 0: " + zeros + " 1: "
				+ ones);
		return 0;
	}

}