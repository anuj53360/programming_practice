package linkedlist;

public class NthNodeFromLastLinkedList {

	
	Node head;
	
	private class Node{
		
		int data;
		Node next;
		
		private Node(int data) {
			this.data=data;
			Node next=null;
		}
		
	}
	
	
	public static int nodeFromLastLinkedList(Node head,int position) {
		int count=0;
	Node firstpointer=head;
		Node secondpointer=head;
		
		if(head.next==null) {
			System.out.println("there is no linked list present");
		}
		
		while(count<position) {
			firstpointer=firstpointer.next;
		count++;
		}
		
		while (firstpointer!=null) {
			firstpointer=firstpointer.next;
			secondpointer=secondpointer.next;
			
		}
		
		return secondpointer.data;
	}
	
	
	public static void main(String[] args) {
		
		
	//	nodeFromLastLinkedList();
	}
}
