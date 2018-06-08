package com.example.collections.linkedlist.copy;

import java.util.Iterator;

public class SinglyLinkedListTest {
	
	public static <T> void main(String[] args) {
		SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		//lst.remove(2);
		lst.removeByPosition(2);

		Iterator<Integer> iter = lst.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
