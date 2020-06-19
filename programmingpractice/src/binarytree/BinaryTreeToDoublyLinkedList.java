package binarytree;

public class BinaryTreeToDoublyLinkedList {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			left = null;
			right = null;
		}
	}

	TreeNode root;

	TreeNode head = null;
	TreeNode prev = null;

	public TreeNode convertBinarytoDLL(TreeNode node) {
		if (node == null)
			return null;

		if (prev == null) {
			head = node;
			prev = node;
		} else {
			node.left = prev;
			prev.right = node;
			prev = node;
		}
		return head;
	}

	public static void main(String[] args) {
		BinaryTreeToDoublyLinkedList btdll = new BinaryTreeToDoublyLinkedList();
		btdll.root = btdll.new TreeNode(10);
		btdll.root.left = btdll.new TreeNode(12);
		btdll.root.left.left = btdll.new TreeNode(25);
		btdll.root.left.right = btdll.new TreeNode(30);
		btdll.root.right = btdll.new TreeNode(15);
		btdll.root.right.left = btdll.new TreeNode(36);
	}
}
