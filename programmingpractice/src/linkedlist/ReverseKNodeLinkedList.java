package linkedlist;

public class ReverseKNodeLinkedList {

	Node head;
	
	class Node{
		
     int data;
     Node next;
     
     Node(int data){
    	 this.data=data;
    	 next=null;
     }
	}
	
	
	public Node reverse(Node head,int k) {
		Node prev=null;
		Node next=null;
		Node current=head;
		int count=0;
		while(count<k && current!=null) {
           
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}

		
		if(next!=null) {
			head.next=reverse(next, k);
		}
		
		return prev;
	}
	
	public void push(int data) {
		Node new_Node=new Node(data);
		new_Node.next=head;
		head=new_Node;
	}
	
	public void printList() {
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}			
      System.out.println();
}
	
	
	public static void main(String []args) {
	ReverseKNodeLinkedList rll=new ReverseKNodeLinkedList();
	rll.push(9); 
	rll.push(8); 
	rll.push(7); 
	rll.push(6); 
	rll.push(5); 
	rll.push(4); 
	rll.push(3); 
	rll.push(2); 
	rll.push(1);
	
	rll.printList();
	System.out.println("reversed list");
	rll.head=rll.reverse(rll.head, 3);
	rll.printList();
	}
	
}
