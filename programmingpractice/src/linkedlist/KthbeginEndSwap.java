package linkedlist;

public class KthbeginEndSwap {

	class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	ListNode head;

	public void insert(int data) {
		ListNode newnode = new ListNode(data);
		newnode.next = head;
		head = newnode;
	}

	public void printList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public int countNodes() {
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void swapKthNodes(int k) {
		int count = countNodes();
		System.out.println(count + "count");
		ListNode starnode = head;
		ListNode startprev = null;
		ListNode endprev = null;
		ListNode endnode = head;
		int startcount = 0;
		int endcount = 0;
		while (startcount < k) {
			startprev = starnode;
			starnode = starnode.next;
			startcount++;
		}

		while (endcount < count - k + 1) {
			endprev = endnode;
			endnode = endnode.next;
			endcount++;
		}

		if (startprev != null) {
			startprev.next = endnode;
		}

		if (endprev != null) {
			endprev.next = starnode;
		}

		ListNode temp = starnode.next;
		starnode.next = endnode.next;
		endnode.next = starnode.next;

		if (k == 1)
			head = endnode;
		if (k == count)
			head = starnode;

	}

	public static void main(String[] args) {
		KthbeginEndSwap beginend = new KthbeginEndSwap();
		beginend.insert(8);
		beginend.insert(7);
		beginend.insert(6);
		beginend.insert(5);
		beginend.insert(4);
		beginend.insert(3);
		beginend.insert(2);
		beginend.insert(1);
		beginend.printList();
		int k = 2;
		beginend.swapKthNodes(k);

	}
}
