package linkedlist;

public class SortList {

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	ListNode head;

	public void addList(int val) {
		ListNode new_Node = new ListNode(val);
		new_Node.next = head;
		head = new_Node;
	}

	public void printList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;

		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		return mergeList(l1, l2);
	}

	public ListNode mergeList(ListNode l1,ListNode l2) {
		ListNode l=new ListNode(0);
		ListNode p=l;
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				p.next=l1;
				l1=l1.next;
			}else {
				p.next=l2;
				l2=l2.next;
			}
			p=p.next;
		}
		if(l1!=null) {
			p.next=l1;
		}
		if(l2!=null) {
			p.next=l2;
		}
		return l.next;
	}

	public static void main(String[] args) {

	}
}
