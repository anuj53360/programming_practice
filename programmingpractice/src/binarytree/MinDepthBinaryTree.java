package binarytree;

public class MinDepthBinaryTree {

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

	int minDepth(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left == null)
			return minDepth(root.right) + 1;

		if (root.right == null)
			return minDepth(root.left) + 1;

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	public static void main(String[] args) {

		MinDepthBinaryTree mindepth = new MinDepthBinaryTree();
		mindepth.root = mindepth.new Node(1);
		mindepth.root.left = mindepth.new Node(2);
		mindepth.root.right = mindepth.new Node(3);
		mindepth.root.left.left = mindepth.new Node(4);
		mindepth.root.left.right = mindepth.new Node(5);

	}
}
