package com.example.collections.linkedlist;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T>{

	Node<T> head;

	public void insertAtBegin(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;

		}
	}

	public void insertAtEnd(T data) {
		Node<T> node = new Node<T>(data);

		if (head == null) {
			head = node;
		} else {

			Node<T> temp;
			temp = head;
			while (true) {
				if (temp.getNext() == null) {
					temp.next = node;
					break;

				}
				temp = temp.next;
			}

		}
	}
	
	public void insert(T data) {
		insertAtEnd(data);
	}
	
	public void insertAtPosition(T data, int position) {
		Node<T> node = new Node<T>(data);

		Node<T> temp = head;

		for(int i = 1;i<position;i++)
		{
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		
		
	}
	
	public void removeFromBegin() {
		Node<T> temp = head.next;
		head = temp;
	}
	
	public void removeFromEnd() {
		Node<T> temp = head;
		Node<T> q = null;

		Node<T> next = temp.getNext();
		
		while ((next = temp.getNext()) != null) {
			q = temp;
			temp = next;
		}
		q.next = null;
	}

	public void traverse() {
		Node<T> temp = head;

		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp.data);
			temp = temp.getNext();

		}
	}
	
	public int size() {
		int i = 0;
		Node<T> temp = head;

		while (true) {
			if (temp == null) {
				break;
			}
			temp = temp.getNext();
			i++;
		}
		
		return i;
	}

	@Override
	public Iterator<T> iterator() {
		return new CustomIterator<T>(head);
	}


}
