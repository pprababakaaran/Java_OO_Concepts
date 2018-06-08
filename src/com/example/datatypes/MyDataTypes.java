package com.example.datatypes;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


public class MyDataTypes {
	
	public static void main(String args[]) {
		
		Vector<Integer> vec = new Vector<Integer>();// default size set to 10
		Vector<Integer> vec1 = new Vector<Integer>(20);// size set to 20
		Vector<Integer> vec2 = new Vector<Integer>(20,10);// size set to 20 and increment by 10
		vec.add(11); // Synchronized block inside add method
		vec.addElement(12);// Synchronized method
		vec.add(2, 13);// Insert at specific index
		
		Enumeration<Integer> vecEnum = vec.elements();
		
		while(vecEnum.hasMoreElements())
		{
			System.out.println(vecEnum.nextElement());
		}
		
		Iterator<Integer> vecIter = vec.iterator();
		while (vecIter.hasNext()) {
			System.out.println(vecIter.next());
			
		}
		
		ListIterator<Integer> listIter = vec.listIterator();
		
		while(listIter.hasNext())
		{
			System.out.println(listIter.next());

		}
		while(listIter.hasPrevious())
		{
			System.out.println(listIter.previous());
			listIter.remove();

		}
		
		List<String> list = new LinkedList<>();
		list.add("Hi");
		list.add("Hi");
		list.add("Hello");
		list.add("Test");
		
		List<String> list1 = new LinkedList<>();
		list1.add("Hi");
		
		list.removeAll(list1);
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
