package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponent {
         
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
		this.val=val;
		next=null;
		}
	}
	        ListNode head;
	    
	        public void push(int data) {
	        	ListNode newnode=new ListNode(data);
	        	newnode.next=head;
	        	head=newnode;
	        }
	        
	        public void printlist() {
	        	ListNode temp=head;
	        	while(temp!=null) {
	        		System.out.println(temp.val);
	        	temp=temp.next;
	        	}
	        }
	        
	        public int numComponents(ListNode head, int[] G) {
	        	Set<Integer> set=new HashSet<>();
	        	int count=0;
	        	for (Integer integer : G) {
					set.add(integer);
				}
	        	while(head!=null) {
	        		ListNode temp=head;	
	        		boolean found=false;
	          while(temp!=null && set.contains(temp.val)) {
	        	  found=true;
	        	  temp=temp.next;
	          }
	          if(found) {
	        	  count++;
	          }
	          head=temp==null?temp:temp.next;
	        	}
	        	return count;
	        }
	        
	
	
	public static void main(String[] args) {
		LinkedListComponent llc=new LinkedListComponent();
		llc.push(3);
		llc.push(2);
		llc.push(1);
		llc.push(0);
		llc.printlist();
		int []G= {0, 1, 3};
		llc.numComponents(llc.head,G);
	}
}
