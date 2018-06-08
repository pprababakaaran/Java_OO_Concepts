package com.example.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class CollectionsTest implements Cloneable{

	public static void main(String args[]) {
		List<String> a = new ArrayList<String>();
		Set<String> a1 = new HashSet<String>();
		Vector<String> a2 = new Vector<String>();
		Stack<String> a3 = new Stack<String>();

		
		Iterator<String> i = a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}

		ListIterator<String> it = a.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			it.hasPrevious();
			it.previous();
			it.add("test");
		}

	}
}
