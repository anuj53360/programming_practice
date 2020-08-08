package anuj_array_geeksforgeeks;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
			next = null;
		}
	}

	Node head;

	public static void main(String[] args) {
		int k = 3;
		int n = 4;
		MergeKSortedLinkedList ms = new MergeKSortedLinkedList();

		Node[] arr = new Node[k];
		arr[0] = ms.new Node(1);
		arr[0].next = ms.new Node(3);
		arr[0].next.next = ms.new Node(5);
		arr[0].next.next.next = ms.new Node(7);

		arr[1] = ms.new Node(2);
		arr[1].next = ms.new Node(4);
		arr[1].next.next = ms.new Node(6);
		arr[1].next.next.next = ms.new Node(8);

		arr[2] = ms.new Node(0);
		arr[2].next = ms.new Node(9);
		arr[2].next.next = ms.new Node(10);
		arr[2].next.next.next = ms.new Node(11);

		Node head = ms.mergeKSortedLists(arr, k);
		ms.printList(ms.head);

	}

	private Node mergeKSortedLists(Node[] arr, int k) {

		Node head = null;
		Node last = null;

		PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				
				return o1.val-o2.val;
			}
		});

		for (int i = 0; i < k; i++) {
			if (arr[i] != null)
				pq.add(arr[i]);
		}
		
//		while(!pq.isEmpty()) 
//		{
//			System.out.println(pq.poll().val);
//		}

		while (!pq.isEmpty()) {
			Node temp = pq.peek();
			System.out.println("AAAAA"+temp.val);
			pq.poll();

			if (temp.next != null)
				System.out.println(temp.val+" "+temp.next.val);
				pq.add(temp.next);

			if (head == null) {
				head = temp;
				last = temp;
			} else {
				last.next = temp;
				last = temp;
			}

		}

		return head;
	}
	
	public static void printList(Node head) 
    { 
        while (head != null) { 
            System.out.print(head.val + " "); 
            head = head.next; 
        } 
    } 
}
