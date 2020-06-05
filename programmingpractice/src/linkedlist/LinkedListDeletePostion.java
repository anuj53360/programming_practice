package linkedlist;

public class LinkedListDeletePostion {

	Node head;
	
	private class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			Node next=null;
		}
	}
	
	public void push(int data) {
		Node new_node =new Node(data);
	new_node.next=head;
	head=new_node;
	}
	
	 public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	    }
	 
	public void deletePostionNode(int position) {
		int count=0;
		Node temp=head;
		Node prev=null;
		
		while (temp.next!=null) {
			temp=temp.next;
			prev=temp;
			count++;
			if(count==position) {
				System.out.println(temp.data);
			prev.next=temp.next.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedListDeletePostion linkedlist=new LinkedListDeletePostion();
		linkedlist.push(7); 
		linkedlist.push(1); 
		linkedlist.push(3); 
		linkedlist.push(2); 
		linkedlist.push(8); 
		linkedlist.push(9); 
		
		linkedlist.printList(); 
		linkedlist.deletePostionNode(4);
		linkedlist.printList(); 
		
	}
}
