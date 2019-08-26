package com.mng.queue.list;

class Queue {
	private int length;
	private ListNode front;
	private ListNode rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enQueue(int data) {
		ListNode temp = new ListNode(data);
		
		if(isEmpty()) {
			front = temp;
		} else {
			rear.next=temp;
		}
		rear=temp;
		length ++;
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}
		
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.print("null");
	}

	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
}

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.display();

	}
}
