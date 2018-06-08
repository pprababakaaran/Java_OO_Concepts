package com.example.collections;

class Node<T> implements Comparable<T> {

	private T value;
	private Node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	@Override
	public int compareTo(T o) {
		if (o == this.value) {
			return 0;
		} else {
			return 1;
		}
	}

}

public class CustomLinkedList<T> {

	Node<T> head;
	Node<T> tail;

	public void add(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);

		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public void deleteFront() {

		if (head == null) {
			System.out.println("Overflow");
		}

		Node<T> temp = head;
		head = temp.getNextRef();
		if (head == null) {
			tail = null;
		}
	}

	public void traverse() {
		Node<T> temp = head;
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp.getValue());
			temp = temp.getNextRef();
		}
	}

	public static void main(String a[]) {
		CustomLinkedList<Integer> sl = new CustomLinkedList<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		sl.deleteFront();
		sl.traverse();
	}

}
