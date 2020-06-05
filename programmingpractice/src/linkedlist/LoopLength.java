package linkedlist;

public class LoopLength {

	Node head;
	
	
	public class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		 this.next=null;
		}
	}
	
	
	public static int loopLength(Node head) {
		
		int count=0;
		Node firstpointer=head;
		Node secondpointer=head;
		
		while(firstpointer!=null || firstpointer.next!=null) {
			
			firstpointer=firstpointer.next.next;
			secondpointer=secondpointer.next;
			
			Node temp;
			
			if (firstpointer==secondpointer) {
				
				temp=secondpointer;
				while(temp!=secondpointer) {
					count++;
					temp=temp.next;
				}
			return count;
			}
		}
		
		
		
		return 0;
	} 
	
	
	public static void main(String[] args) {
		
	//	loopLength();
		
	}
}
