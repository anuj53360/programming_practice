package anuj_array_geeksforgeeks;

public class BTisMaxHeap {

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}

	Node root;

	public static void main(String[] args) {
		BTisMaxHeap maxheap = new BTisMaxHeap();
		Node root = maxheap.new Node(10);
		root.left = maxheap.new Node(9);
		root.right = maxheap.new Node(8);
		root.left.left = maxheap.new Node(7);
		root.left.right = maxheap.new Node(6);
		root.right.left = maxheap.new Node(5);
		root.right.right = maxheap.new Node(4);
		root.left.left.left = maxheap.new Node(3);
		root.left.left.right = maxheap.new Node(2);
		root.left.right.left = maxheap.new Node(1);
		maxheap.isHeap(maxheap.root);
	}

	private boolean isHeap(Node root) {
		// Tree must be complete tree
		// Parent node must be greater than both children

		if (root == null)
			return true;
		int countnodes = countNodes(root);
		if (isCompleteTree(root, 0, countnodes) == true && isHeapUtil(root) == true)
			return true;
		return false;

	}

	private boolean isHeapUtil(Node root) {

		if (root.left == null && root.right == null)
			return true;

		if (root.right == null) {
			return root.val > root.left.val;
		} else {
			if (root.val > root.left.val && root.val > root.right.val) {
				return (isHeapUtil(root.left) && isHeapUtil(root.right));
			} else
				return false;
		}
	}

	private boolean isCompleteTree(Node root, int i, int countnodes) {
		if (root == null)
			return true;
		if (i > countnodes)
			return false;
		return (isCompleteTree(root.left, 2 * i + 1, countnodes) && isCompleteTree(root.right, 2 * i + 2, countnodes));
	}

	private int countNodes(Node root) {
		if (root == null)
			return 0;
		return (1 + countNodes(root.left) + countNodes(root.right));
	}
}
