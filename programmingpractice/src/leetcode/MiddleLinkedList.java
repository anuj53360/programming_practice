package leetcode;

public class MiddleLinkedList {
        
	     Node head;
     class Node{
    	 int data;
    	 Node next;
    	 Node(int data){
    		 this.data=data;
    		 next=null;
    	 }
     }	     
	
     public void insertNode(int data) {
    	 Node temp=null;
    	 Node newNode=new Node(data);
    	 newNode.next=head;
    	 head=newNode;
     }
     
public void printList(Node head) {
	Node temp=head;
	while(temp.next!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}

public Node middleNode(Node head) {
    
	Node slowptr=head;
	Node fastptr=head;
	
	while(fastptr!=null && fastptr.next!=null) {
	fastptr=fastptr.next.next;
	slowptr=slowptr.next;
	}
	return slowptr;
}

	public static void main(String[] args) {
		MiddleLinkedList addll= new MiddleLinkedList();
	      addll.insertNode(6);
	      addll.insertNode(4);
	      addll.insertNode(9);
	      addll.insertNode(5);
	      addll.insertNode(7);
		
		
		
		
	}
}
