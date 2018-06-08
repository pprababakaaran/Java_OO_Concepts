package com.example.collections.linkedlist.copy;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	CustomNode<T> current;

	public MyIterator(CustomNode<T> head) {
		current = head;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() {
		T data = current.data;
		current = current.next;
		return data;
	}

}
