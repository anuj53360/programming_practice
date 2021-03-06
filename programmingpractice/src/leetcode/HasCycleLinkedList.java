package leetcode;

public class HasCycleLinkedList {

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
	
   public boolean hasCycle(ListNode head) {
	   if(head==null || head.next==null) {
		   return false;
	   }
	    ListNode slowptr=head;
	    ListNode fastptr=head;
	    while(slowptr!=fastptr) {
	    	if(fastptr==null || fastptr.next==null) {
	    		return false;
	    	}
	    	fastptr=fastptr.next.next;
	    	slowptr=slowptr.next;
	    }
	   return true;
   }
	
	
	
	
	public static void main(String[] args) {
	   HasCycleLinkedList hcll=new HasCycleLinkedList();	
	}
}
