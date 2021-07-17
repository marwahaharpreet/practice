package com.ds;

public class LinkedList {

	
	public static void main(String args[]) {
		
		LinkedList ls = new LinkedList();
		Node<Integer> head = new Node<Integer>(1);
		Node<Integer> second = new Node<Integer>(2);
		Node<Integer> third = new Node<Integer>(3);
		Node<Integer> fourth = new Node<Integer>(5);
		Node<Integer> insert = new Node<Integer>(4);
		head.next = second;
		head.next.next = third;
		head.next.next.next = fourth;	
	  //  ls.printList(head);
//		head = ls.reverse(head);
//		ls.printList(head);
//		
//		head = ls.deleteNode(1 , head);
//		ls.printList(head);
		
		head = ls.sortedInsert(head, insert);
		ls.printList(head);
		
		}
	
	public void printList(Node node) {
		
		while (node !=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	
	public Node reverse(Node node) {
		Node temp1 = null;
		Node current = node;
		Node temp2 = null;
		while( current != null) {
			temp1 = current.next;
			current.next= temp2;
			temp2 = current;
			current = temp1;
		}
		node = temp2;
		
		return node;
	}
	
	public Node deleteNode(int position , Node node) {
		
		Node temp = node;
		
		if ( position == 0) {
			node = temp.next;
			return node;
		}
		
		for (int i = 0; temp !=null && i<position -1 ; i++) {
			
			temp = temp.next;
		}
		
		Node next = temp.next.next;
		temp.next = next;
		
		
		return node;
		
	}
	
	public Node sortedInsert(Node<Integer> head , Node<Integer> new_node) {
		
		Node<Integer> current = null;
		
		if (head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		}else {
			current = head;
			while(current.next !=null && current.next.data < new_node.data) 
				current = current.next;
				new_node.next = current.next;
				current.next = new_node;
				
			 // head=current;
			
		}
		return head;
		
	}
	

}
