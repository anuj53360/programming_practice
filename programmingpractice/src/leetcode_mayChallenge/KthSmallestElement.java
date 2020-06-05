package leetcode_mayChallenge;

import java.util.concurrent.atomic.AtomicInteger;

public class KthSmallestElement {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.val = val;
			left = null;
			right = null;

		}
	}

	TreeNode root;

	public int kthSmallest(TreeNode root, int k) {
		AtomicInteger count = new AtomicInteger();
		AtomicInteger result = new AtomicInteger();
		kthsmallestUtil(root, k, count, result);
		return result.get();
	}

	public void kthsmallestUtil(TreeNode root, int k, AtomicInteger count, AtomicInteger result) {
		if (root.left != null)
			kthsmallestUtil(root.left, k, count, result);
		count.getAndIncrement();

		if (count.get() == k) {
			result.set(root.val);
			return;
		}
		if (root.right != null)
			kthsmallestUtil(root.right, k, count, result);

	}

	public static void main(String[] args) {
		KthSmallestElement smallest = new KthSmallestElement();
		smallest.root = smallest.new TreeNode(5);
		smallest.root.left = smallest.new TreeNode(3);
		smallest.root.left.left = smallest.new TreeNode(2);
		smallest.root.left.left.left = smallest.new TreeNode(1);
		smallest.root.left.right = smallest.new TreeNode(4);
		smallest.root.right = smallest.new TreeNode(5);

		smallest.kthSmallest(smallest.root);

	}
}
