/* IMPORTANT: Multiple classes and nested static classes are supported */

package com.hackers.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class TestClass {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of characters in a string...");
		String numberOfCharStr = br.readLine();
		int strLength = Integer.parseInt(numberOfCharStr);

		System.out.println("Enter the string...");
		String inputStr = br.readLine();

		if (inputStr.length() != strLength) {
			System.out.println("Entered string legnth is not valid");
			System.exit(0);
		}

		System.out.println("Enter the number of queries to process...");
		String queryLengthStr = br.readLine();
		int queryLength = Integer.parseInt(queryLengthStr);

		String query[] = new String[queryLength];
		for (int i = 1; i <= queryLength; i++) {
			System.out.println("Enter input " + i + " with space");
			String tempQuery = br.readLine();
			if (tempQuery.length() != 3) {
				System.out.println("Invalid query length. Query should be like a b or b a or c a");
				System.exit(0);
			} else {
				char[] temp = tempQuery.toCharArray();
				if (Character.isWhitespace(temp[1])) {
					query[i - 1] = tempQuery;
				} else {
					System.out.println("Invalid query string. Query string format should be like a b or b a or c a");
					System.exit(0);
				}

			}

		}

		for (int i = 1; i <= queryLength; i++) {
			List<Integer> xOccurance = new ArrayList<Integer>();
			List<Integer> yOccurance = new ArrayList<Integer>();

			char[] tempQuery = query[i - 1].toCharArray();

			char xStr = tempQuery[0];
			char yStr = tempQuery[2];

			// X character occruance
			int index = inputStr.indexOf(xStr);
			while (index >= 0) {
				xOccurance.add(index);
				index = inputStr.indexOf(xStr, index + 1);
			}

			// y character occruance
			index = inputStr.indexOf(yStr);
			while (index >= 0) {
				yOccurance.add(index);
				index = inputStr.indexOf(yStr, index + 1);
			}

			int xyCount = 0;
			int yxCount = 0;

			// X...Y occurance count
			for (Integer xVal : xOccurance) {
				for (Integer yVal : yOccurance) {
					if (yVal > xVal) {
						xyCount++;
					}
				}
			}

			// Y...X occurance count
			for (Integer yVal : yOccurance) {
				for (Integer xVal : xOccurance) {
					if (xVal > yVal) {
						yxCount++;
					}
				}
			}

			System.out.println((xyCount + yxCount));
		}

	}
}
