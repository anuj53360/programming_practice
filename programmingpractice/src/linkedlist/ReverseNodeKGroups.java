package linkedlist;

public class ReverseNodeKGroups {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode curr = head;
		int count = 0;
		while (count < k) {
			if (curr == null)
				return head;
			curr = curr.next;
			count++;
		}
		ListNode prev = reverseKGroup(curr, k);
		while (count > 0) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
			count--;
		}

		return prev;
	}

	public static void main(String[] args) {

	}
}
