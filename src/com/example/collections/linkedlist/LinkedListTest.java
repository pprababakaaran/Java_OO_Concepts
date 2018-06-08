package com.example.collections.linkedlist;

import java.util.Iterator;

public class LinkedListTest {

	public static <T> void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
		list.insertAtBegin(10);
		list.insertAtBegin(15);
		list.insertAtEnd(8);
		list.insert(7);
		list.insertAtPosition(6, 2);
		list.removeFromBegin();
		list.removeFromEnd();
		list.traverse();
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("size :"+list.size());
	}

}
