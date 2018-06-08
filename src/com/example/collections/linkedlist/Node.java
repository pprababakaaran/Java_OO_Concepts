package com.example.collections.linkedlist;

public class Node<T> {

	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "CustomNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
