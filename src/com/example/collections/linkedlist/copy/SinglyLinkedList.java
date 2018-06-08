package com.example.collections.linkedlist.copy;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T> {

	CustomNode<T> head;

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(head);
	}

	public void addFirst(T data) {
		CustomNode<T> node = new CustomNode<T>(data);
		if (head == null) {
			head = node;
		} else {
			CustomNode<T> temp = head;
			head = node;
			head.next = temp;
		}
	}

	public void add(T data) {
		CustomNode<T> node = new CustomNode<T>(data);
		if (head == null) {
			head = node;
		} else {
			CustomNode<T> temp = head;
			while (true) {
				if (temp.next == null) {
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void remove(T data) {
		if (head == null) {
			System.out.println("No Element to remove");
		} else if (head.data.equals(data)) {
			head = head.next;
		} else {
			CustomNode<T> cur = head;
			CustomNode<T> p = null;
			while (cur != null) {
				p = cur.next;
				if (p.data.equals(data)) {
					cur.next = p.next;
					break;
				}
				cur = p;
			}
		}
	}

	public void removeByPosition(int position) {
		if (head == null) {
			System.out.println("No Element to remove");
		} else if(position == 0) {
			head = head.next;
		} else {
			CustomNode<T> temp = head;
			for(int i=1; i<position;i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

}
