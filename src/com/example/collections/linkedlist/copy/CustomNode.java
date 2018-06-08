package com.example.collections.linkedlist.copy;

public class CustomNode<T> {

	T data;
	CustomNode<T> next;

	public CustomNode(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public CustomNode<T> getNext() {
		return next;
	}

	public void setNext(CustomNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "CustomNode [data=" + data + ", next=" + next + "]";
	}

}
