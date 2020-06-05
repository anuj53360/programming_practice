package leetcode;

public class ReverseLinkedList {

	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			this.val=val;
			next=null;
		}
	}
	
	ListNode head;
	
	public void insert(int data) {
		ListNode new_node=new ListNode(data);
	    new_node.next=head;
       head=new_node;	
	}
	
	public void printList() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val);
			temp=temp.next;
		}
	}
	
	public ListNode reverseLinkedList(ListNode head) {
	//	ListNode temp=head;
		ListNode curr=head;
		ListNode prev=null;
		ListNode next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		prev=head;
		return prev;
	}
	
	
	
	public static void main(String[] args) {
		ReverseLinkedList rll=new ReverseLinkedList();
		
		
	}
}
