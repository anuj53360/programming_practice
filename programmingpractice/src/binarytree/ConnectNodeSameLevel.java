package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodeSameLevel {

	class Node {
		int val;
		Node left;
		Node right;
		Node nextright;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
			nextright = null;
		}
	}

	Node root;

	public Node connectNodeSameLevel(Node rooot) {

		Queue<Node> queue = new LinkedList<>();
		queue.add(rooot);
		queue.add(null);

		while (!queue.isEmpty()) {

			Node temp = queue.peek();
			queue.poll();

			if (temp != null) {
				temp.nextright = queue.peek();

				if (temp.left != null) {
					queue.add(temp.left);
				}

				if (temp.right != null) {
					queue.add(temp.right);
				}
			}

			else if (!queue.isEmpty()) {
				queue.add(null);
			}

		}

		return rooot;
	}

	public static void main(String[] args) {
		ConnectNodeSameLevel connectnode = new ConnectNodeSameLevel();
		connectnode.root = connectnode.new Node(10);
		connectnode.root.left = connectnode.new Node(8);
		connectnode.root.left.left = connectnode.new Node(3);
		connectnode.root.right = connectnode.new Node(2);
		connectnode.root.right.right = connectnode.new Node(90);
		connectnode.connectNodeSameLevel(connectnode.root);

	}
}
