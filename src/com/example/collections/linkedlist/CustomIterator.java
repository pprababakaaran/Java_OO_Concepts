package com.example.collections.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator<T> implements Iterator<T> {

	 private Node<T> current;

	public CustomIterator(Node<T> node) {
		this.current = node;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() throws NoSuchElementException {
		if (!this.hasNext()) {
			throw new NoSuchElementException("end of the iteration");
		}
		T data = current.data;
		current = current.next; 
		return data;
	}

	public void remove() throws IllegalStateException {
		if (current == null) {
			throw new IllegalStateException("improper iterator state for remove operation");
		} else {
			current = null;
		}
	}

}
