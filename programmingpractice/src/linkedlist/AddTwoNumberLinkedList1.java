package linkedlist;

public class AddTwoNumberLinkedList1 {

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

	public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		l1 = reverselist(l1);
		l2 = reverselist(l2);
		if (listlength(l2) > listlength(l1)) {
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		ListNode main = l1;
		ListNode prev = l1;
		int carry = 0;

		while (l1 != null) {
			if (l2 != null) {
				l1.val += l2.val;
				l2 = l2.next;
			}
			l1.val+=carry;
			carry=l1.val/10;
			l1.val%=10;
			prev=l1;
			l1=l1.next;
		}
		while(carry>0) {
			 prev.next=new ListNode(carry);
			prev=prev.next;
		    carry=prev.val/10;
		    prev.val%=10;
		}
		
		

		return reverselist(main);
	}

	public  ListNode reverselist(ListNode node) {
		ListNode prev = null;
		ListNode curr = node;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public  int listlength(ListNode temp) {
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		AddTwoNumberLinkedList1 atll = new AddTwoNumberLinkedList1();
		AddTwoNumberLinkedList1 atll1 = new AddTwoNumberLinkedList1();
		atll.push(3);
		atll.push(4);
		atll.push(2);
		atll.push(7);
		atll.printlist();
		atll.reverselist(atll.head);
		atll.printlist();
		atll1.push(4);
		atll1.push(6);
		atll1.push(5);
		atll1.printlist();
		atll1.reverselist(atll1.head);
		atll1.printlist();
		atll.addTwoNumbers(atll.head, atll1.head);

	}
}
