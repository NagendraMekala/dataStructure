package com.mng.singlelinked.list;

class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SingleLinkedList {
//	private ListNode head;
	public static void main(String[] args) {
		SingleLinkedList obj = new SingleLinkedList();

		// 10 -> 8 -> 1 -> 11 -> null;
		// 10 as head node of linked list
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);

		// attache them together to from a list
		head.next = second; // 10 -> 8
		second.next = third; // 10 -> 8 -> 1
		third.next = fourth; // 10 -> 8 -> 1 -> 11 -> null;

		System.out.println("initialy linked list elements");
		// print the head elements
		obj.display(head);
				
		System.out.println("Adding element at beginning of linkedlist");
		
		// insert element at beginning of linked list
		ListNode newNode = obj.insertAtBeginning(head, 15);
		// print the head elements
		obj.display(newNode);
		
        System.out.println("Adding element at end of linkedlist");
		
		// insert element at beginning of linked list
		ListNode newNode2 = obj.insertAtEnd(newNode, 20);
		
		// print the head elements
		obj.display(newNode2);
		
		

        System.out.println("insert element after previous node");
		
		// insert element at beginning of linked list
        obj.insertAfter(second, 88);
		
		// print the head elements
		obj.display(newNode2);
				
		// find the length of the linked list
		System.out.println("length of the linked list: "+obj.findLength(newNode2));
	}

	private void insertAfter(ListNode previous, int data) {
		if(previous == null) {
			System.out.println("the given node previous noe can't be null");
		}
		
		ListNode newnode = new ListNode(data);
		newnode.next = previous.next;
		previous.next = newnode;
	}

	/**
	 * Adding element at end of linkedlist
	 * @param head
	 * @param data
	 * @return
	 */
	private ListNode insertAtEnd(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return head;
		}
		
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
 
	/**
	 *  insert element at beginning of linked list
	 * @param head
	 * @param data
	 * @return
	 */
	private ListNode insertAtBeginning(ListNode head, int data) {
		ListNode newNode = new ListNode(data);

		if (head == null) {
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	/**
	 * print the head elements
	 * 
	 * @param head
	 */
	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println(current);
	}

	/**
	 * find the length of the linked list
	 * 
	 * @param head
	 */
	public int findLength(ListNode head) {
		if (head == null)
			return 0;
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
}
