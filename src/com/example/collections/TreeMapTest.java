package com.example.collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Employee2 e = new Employee2(1,"Praba",100);
		Employee2 e1 = new Employee2(2,"B",200);
		Employee2 e2 = new Employee2(2, "A",300);
		Employee2 e3 = new Employee2(4, "Santhosh",400);
		Employee2 e4 = new Employee2(4, "Santhosh",600);
		
		Map<Employee2,Integer> eMap = new TreeMap<Employee2,Integer>(new Employee2Comparator());
		eMap.put(e, 1);
		eMap.put(e1, 2);
		eMap.put(e2, 3);
		eMap.put(e3, 4);
		eMap.put(e4, 5);
/*
 * IF Employee class doesnot implement Comparable, compiler will throw below exception
 * 
 * 
 * Exception in thread "main" java.lang.ClassCastException: com.example.collections.Employee cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1290)
	at java.util.TreeMap.put(TreeMap.java:538)
	at com.example.collections.TreeMapTest.main(TreeMapTest.java:16)
 * 		
 */
		System.out.println(eMap.toString());
		
	}

}
