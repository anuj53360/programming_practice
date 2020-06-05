package stack;

public class QueueUsingLinkedList {
      Node head;
	   Node rear=null;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void enqueue(int key) {
		 Node rear=null;  
		Node temp=new Node(key);
	     if(rear==null) {
	    	 rear=temp;
	    	 head=temp;
	     }
	     rear.next=temp;
	     rear=temp;
	}

	
	public void dequeue() {
		if(head==null) {
			return;
		}
		Node temp=head;
		head=head.next;
	if(head==null) {
		rear=null;
	}
	
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Queue Front : " + q.head.data); 
        System.out.println("Queue Rear : " + q.rear.data);
	}
}
