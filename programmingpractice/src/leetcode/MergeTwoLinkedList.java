package leetcode;



public class MergeTwoLinkedList {
       
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
     	
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         
	ListNode temp=new ListNode(0);
	ListNode tail=temp;
	
	while(true) {
		if(l1==null) {
			tail.next=l2;
		break;
		}
		if(l2==null) {
			tail.next=l1;
		break;
		}
		if(l1.val<=l2.val) {
			tail.next=l1;
			l1=l1.next;
		}
		else {
    	   tail.next=l2;
    	   l2=l2.next;
       }		
		
       tail=tail.next;
	}
	
	
	
	return temp.next;
    }
	
	
	public static void main(String[] args) {
		
	}
}
