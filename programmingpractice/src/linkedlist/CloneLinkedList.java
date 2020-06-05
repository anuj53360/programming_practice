package linkedlist;

public class CloneLinkedList {

	 Node head;
	 
	 static class Node{
		 int data;
		 Node next,random;
		 Node(int data){
			 this.data=data;
			next=null;
			random=null;
		 }
	 }

	 public static void printList(Node head) {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.println("original"+" "+temp.data+" "+"random"+" "+temp.random.data);
		temp=temp.next;
		 }
	 }
	 
	 
	 public static Node clonedList(Node head) {
		 Node curr=head;
		 Node temp=null;
		 while(curr!=null) {
			 temp=curr.next;
			 curr.next=new Node(curr.data);
			 curr.next.next=temp;
			 curr=temp;
		 }
		 curr=head;
		 
		 while(curr!=null) {
			 if(curr.next!=null) {
		     curr.next.random=(curr.random!=null)?curr.random.next:curr.random;
			 }
			 curr=(curr.next!=null)?curr.next.next:curr.next;
		 }
		 

		 Node original=head;
		 Node clone=head.next;
		 Node returnnode=clone;
		 
		 while(original!=null && clone!=null) {
			 original.next=(original.next!=null)?original.next.next:original.next;
			 clone.next=(clone.next!=null)?clone.next.next:clone.next;
		 original=original.next;
		 clone=clone.next;
		 }
		 return returnnode;
	 }
	
	 
	 
public static void main(String[] args) {
	
	
	Node start = new Node(1);  
    start.next = new Node(2);  
    start.next.next = new Node(3);  
    start.next.next.next = new Node(4);  
    start.next.next.next.next = new Node(5);  
  
     
    start.random = start.next.next;  
  
    // 2's random points to 1  
    start.next.random = start;  
  
    // 3's and 4's random points to 5  
    start.next.next.random = start.next.next.next.next;  
    start.next.next.next.random = start.next.next.next.next;  
  
    // 5's random points to 2  
    start.next.next.next.next.random = start.next;  
  
    System.out.println("Original list : ");  
    printList(start);  
  
    System.out.println("Cloned list : ");  
    Node cloned_list = clonedList(start);  
    printList(cloned_list);
}
}
