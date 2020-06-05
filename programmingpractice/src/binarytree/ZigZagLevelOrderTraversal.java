package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagLevelOrderTraversal {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}

	TreeNode root;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list2 = new ArrayList<>();
		TreeNode temp = root;
		if (root == null)
			return list2;
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(root);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			List<Integer> list1 = new ArrayList<>();
			while (!stack1.isEmpty()) {

				temp = stack1.pop();
				list1.add(temp.val);

				if (temp.left != null)
					stack2.add(temp.left);
				if (temp.right != null)
					stack2.add(temp.right);
			}
			list2.add(list1);
			list1 = new ArrayList<>();
			while (!stack2.isEmpty()) {
				temp = stack2.pop();
				list1.add(temp.val);

				if (temp.right != null)
					stack1.add(temp.right);
				if (temp.left != null)
					stack1.add(temp.left);
			}
			if (!list1.isEmpty())
				list2.add(list1);
		}

		return list2;

	}

	public static void main(String[] args) {
		ZigZagLevelOrderTraversal zigzag = new ZigZagLevelOrderTraversal();
		zigzag.root = zigzag.new TreeNode(3);
		zigzag.root.left = zigzag.new TreeNode(9);
		zigzag.root.right = zigzag.new TreeNode(20);
		zigzag.root.right.left = zigzag.new TreeNode(15);
		zigzag.root.right.right = zigzag.new TreeNode(7);
		zigzag.zigzagLevelOrder(zigzag.root);
	}
}
