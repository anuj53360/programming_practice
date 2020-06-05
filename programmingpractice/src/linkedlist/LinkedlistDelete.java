package linkedlist;



public class LinkedlistDelete {
	Node head;
	
	private class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data=data;
		Node next=null;
		}
	}
	
	
	public void deleteNode(int key) {
		Node prev=null;
		Node temp=head;
		while(temp!=null || temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		
	}
	
	
	public static void main(String[] args) {
		
		LinkedlistDelete linkedList=new LinkedlistDelete();
	}
}
