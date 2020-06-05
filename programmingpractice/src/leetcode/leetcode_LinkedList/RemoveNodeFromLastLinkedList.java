package leetcode.leetcode_LinkedList;

public class RemoveNodeFromLastLinkedList {

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
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
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstnode=head;
        ListNode secondnode=head;
        ListNode prev=null;
        int count=0;
        while(count<n) {
        	firstnode=firstnode.next;
        	count++;
        }
        
        while(firstnode!=null ) {
        	prev=secondnode;
        	firstnode=firstnode.next;
        	secondnode=secondnode.next;
        	//System.out.println(prev.val);
        }
        prev.next=secondnode.next;
        
        
        
        
 		
		
		return head;
	}

	public static void main(String[] args) {
     RemoveNodeFromLastLinkedList rnll=new RemoveNodeFromLastLinkedList();
     rnll.insert(5);
     rnll.insert(4);
     rnll.insert(3);
     rnll.insert(2);
     rnll.insert(1);
     rnll.printList();
     rnll.removeNthFromEnd(rnll.head, 2);
     rnll.printList();
	
	}
}
