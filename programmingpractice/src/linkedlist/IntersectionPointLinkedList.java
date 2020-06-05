package linkedlist;

import linkedlist.EvenOddLength.Node;

public class IntersectionPointLinkedList {

	 static Node head1,head2;
	
	  static class Node{
	    	int data;
	    	Node next;
	    	Node(int data){
	    		this.data=data;
	    		next=null;
	    	}
	    } 
	
	public void printList(Node head) {
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
		temp=temp.next;
		}
	}
	
	public static int getCount(Node head) {
		
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;		
	}
	
	
	public static void getIntersectionNode(Node head1,Node head2) {
		
		int count1=getCount(head1);
		int count2=getCount(head2);
		int count=0;
		if(count1>count2) {
		 count=count1-count2;
			getIntersectionUtil(count,head1,head2);
		}else {
			count=count2-count1;
			getIntersectionUtil(count,head2,head1);
		}
		
	}
	
	public static int getIntersectionUtil(int count1, Node head1, Node head2){
		System.out.println(count1);
		int k=0;
		while(k<count1) {
			head1=head1.next;
		k++;
		}
		
		while(head1!=null && head2!=null) {
			if(head1.data==head2.data) {
				System.out.println(head1.data);
				return head1.data;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return k;
		
		
		
	}
	
	public static void main(String[] args) {
		
		IntersectionPointLinkedList list=new IntersectionPointLinkedList();
		list.head1 = new Node(3); 
        list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
  
        // creating second linked list 
        list.head2 = new Node(10); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(30); 
		
        getIntersectionNode(head1,head2);
		
	}
	
	
}
