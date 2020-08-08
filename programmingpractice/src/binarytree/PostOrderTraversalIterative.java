package binarytree;

import java.util.Stack;

public class PostOrderTraversalIterative {

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

	public void postOrder(Node root) {
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			Node temp = stack1.pop();
			stack2.push(temp);

			if (temp.left != null)
				stack1.push(temp.left);

			if (temp.right != null)
				stack1.push(temp.right);
		}

		while (stack2.isEmpty()) {
			Node temp = stack2.pop();
			System.out.println(temp.val);
		}

	}

	public static void main(String[] args) {
		PostOrderTraversalIterative postorder = new PostOrderTraversalIterative();
		postorder.root = postorder.new Node(1);
		postorder.root.left = postorder.new Node(2);
		postorder.root.right = postorder.new Node(3);
		postorder.root.left.left = postorder.new Node(4);
		postorder.root.left.right = postorder.new Node(5);
		postorder.root.right.left = postorder.new Node(6);
		postorder.root.right.right = postorder.new Node(7);
	}
}
