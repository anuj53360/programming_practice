package linkedlist;

public class EvenOddLength {
    Node head;
    
    class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		next=null;
    	}
    } 
    
    public void push(int data) {
    	Node newNode=new Node(data);
    	newNode.next=head;
    	head=newNode;
    }
    
    
public void printList(Node head) {
	Node temp=head;
	
	while(temp!=null) {
		System.out.println(temp.data);
	temp=temp.next;
	}
}    


public void evenodd(Node head) {
	Node temp=head;
	String s="";
	while(temp!=null && temp.next!=null ) {
	temp=temp.next.next;
	}
	if(temp==null) {
		s="evenlength";
	}
	else {
		s="oddlength";
	}
	
	System.out.println(s);
}

	
	public static void main(String[] args) {
		EvenOddLength evenlength=new EvenOddLength();
		evenlength.push(11);
		evenlength.push(12);
		evenlength.push(13);
		evenlength.push(14);
		evenlength.push(15);
		evenlength.push(16);
	evenlength.printList(evenlength.head);
	evenlength.evenodd(evenlength.head);
	}
	
	
}
