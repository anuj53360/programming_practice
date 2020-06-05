package linkedlist;

public class AddTwoNoLinkedList {

	ListNode head;

	class ListNode {

		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			ListNode next = null;
		}
	}

	public void push(int data) {
		ListNode new_node = new ListNode(data);
		new_node.next = head;
		head = new_node;
	}

	public void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public ListNode addTwoList(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int v1 = (l1 == null) ? 0 : l1.val;
			int v2 = (l2 == null) ? 0 : l2.val;
			int sum = v1 + v2+carry;
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
			current = current.next;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		AddTwoNoLinkedList addll = new AddTwoNoLinkedList();
		addll.push(6);
		addll.push(4);
		addll.push(9);
		addll.push(5);
		addll.push(7);
		AddTwoNoLinkedList addll1 = new AddTwoNoLinkedList();
		addll1.push(4);
		addll1.push(8);
		System.out.println("first list");
		// addll.printList(addll.head);
////		ListNode firstreverse = addll.reverse(addll.head);
//		addll.printList(firstreverse);
//
//		System.out.println("second  list");
//		// addll1.printList(addll1.head);
//		Node secondreverse = addll.reverse(addll1.head);
//		addll1.printList(secondreverse);
//
//		AddTwoNoLinkedList addll2 = new AddTwoNoLinkedList();
//		Node rs = addll2.addTwoList(firstreverse, secondreverse);
//		Node resultreverse = addll.reverse(rs);
//		System.out.print("Resultant List is ");
//		addll2.printList(resultreverse);

	}
}
