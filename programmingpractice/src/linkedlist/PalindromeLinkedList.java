//package linkedlist;
//
//import java.util.Stack;
//
//public class PalindromeLinkedList {
//	Node head;
//
//	public class Node{
//		int data;
//		Node next;
//		public Node(int data) {
//			this.data=data;
//			this.next=null;
//		}
//	}
//
//	public static void palindromeLinkedList(Node head) {
//		Stack<Integer> stack=new Stack<>();
//		Node temp=head;
//		while(temp.next!=null) {
//			stack.push(temp.data);
//			temp=temp.next;
//		}
//
//		while(temp.next!=null) {
//			if(temp.data==stack.peek()) {
//				stack.pop();
//			}
//
//		}
//
//
//		if(stack.size()==null) {
//
//		}
//	}
//
//	public static void main(String[] args) {
//		   Node one=new Node(1);
//	        Node two = new Node(2);
//	        Node three = new Node(3);
//	        Node four = new Node(4);
//	        Node five = new Node(3);
//	        Node six = new Node(2);
//	        Node seven = new Node(1);
//	}
//}
