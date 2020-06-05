package linkedlist;

import java.util.Stack;

public class SegregateEvenOdd {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
	
	  void printList() 
	    { 
	        Node temp = head; 
	        while(temp != null) 
	        { 
	            System.out.print(temp.data+" "); 
	            temp = temp.next; 
	        } 
	        System.out.println(); 
	    }
	  
	  public void segrgateEvenOdd() {
		  Node temp=head;
		  
		  Stack<Integer> stack=new Stack<>();
		  
		while(temp!=null || temp.next!=null) {
			if(temp.data%2!=0) {
			stack.push(temp.data);
			temp=temp.next;
			}
			
			}
		  
	  }
	  
	
	
	public static void main(String[] args) {
	
		
		SegregateEvenOdd llist = new SegregateEvenOdd(); 
	        llist.push(11); 
	        llist.push(10); 
	        llist.push(8); 
	        llist.push(6); 
	        llist.push(4); 
	        llist.push(2); 
	        llist.push(0); 
	        System.out.println("Origional Linked List"); 
	        llist.printList(); 
	}
	
}
