package com.example.collections.doublylinkedlist;

public class DoublyLinkedList<T> {

	Node<T> head;
	
	public DoublyLinkedList() {
		this.head = null;
	}

	public void addFirst(T data)
	{
		Node<T> node = new Node<T>(data);
		if(head == null){
			head = node;
			head.next = null;
			head.previous = null;
		} else {
			Node<T> temp = head;
			head = node;
			head.next = temp;
			head.previous = null;
		}
	}
	
	public void add(T data)
	{
		Node<T> node = new Node<T>(data);
		
		if(head == null){
			head = node;
			head.next = null;
			head.previous = null;
		}  else {
			Node<T> temp = head;
			while(true)
			{
				if(temp.next == null)
				{
					node.next = null;
					node.previous = temp;
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
		
	}

	@Override
	public String toString() {
		return "DoublyLinkedList [head=" + head + "]";
	}



	

}
