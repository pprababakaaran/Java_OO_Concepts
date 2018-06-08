package com.example.collections.doublylinkedlist;

public class LinkedListTest {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(list.toString());
		
	}

}
