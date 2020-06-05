package leetcode_mayChallenge;

public class OddEvenLinkedList {

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	ListNode head;

	public void push(int data) {
		ListNode newnode = new ListNode(data);
		newnode.next = head;
		head = newnode;
	}

	public void printlist() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
		System.out.println(" ");
	}

	public ListNode oddEvenList(ListNode head) {
		
		if(head==null || head.next==null) {return head;}
		
		ListNode hodd=head;
		ListNode heven=head.next;
		ListNode odd=hodd;
		ListNode even=heven;
		while(even!=null) 
		{
			if(even.next!=null) {
              odd.next=even.next; 				
			}else {
				odd.next=heven;
				return hodd;
			}
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
      odd.next=heven;		
		return hodd;
	}

	public static void main(String[] args) {

	}
}
