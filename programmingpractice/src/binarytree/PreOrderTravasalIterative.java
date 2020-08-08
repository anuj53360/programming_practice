package binarytree;

import java.util.Stack;

import binarytree.PostOrderTraversalIterative.Node;

public class PreOrderTravasalIterative {

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

	void prerderTravasal(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.println(temp.val);
			if (temp.right != null)
				stack.push(temp.right);

			if (temp.left != null)
				stack.push(temp.left);
		}
	}

	public static void main(String[] args) {
		PreOrderTravasalIterative preorder = new PreOrderTravasalIterative();

		preorder.root = preorder.new Node(1);
		preorder.root.left = preorder.new Node(2);
		preorder.root.right = preorder.new Node(3);
		preorder.root.left.left = preorder.new Node(4);
		preorder.root.left.right = preorder.new Node(5);
		preorder.root.right.left = preorder.new Node(6);
		preorder.root.right.right = preorder.new Node(7);
	}

}
