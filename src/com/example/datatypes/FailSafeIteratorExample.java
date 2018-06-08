package com.example.datatypes;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> premiumPhone =

		new ConcurrentHashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<String>();
		arr.add("Test1");
		arr.add("Test2");
		arr.add("Test3");
		Iterator iter = arr.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
			arr.add("Sony");
		}

	}
}
