package binarytree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PairWithGivenSumBST {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	TreeNode root;

	boolean pairWithGivenSum(TreeNode root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (set.contains(sum - temp.data)) {
				System.out.println(temp.data + " " + (sum - temp.data));
				return true;
			} else {
				set.add(temp.data);
			}

			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		PairWithGivenSumBST pwbst = new PairWithGivenSumBST();
		pwbst.root = pwbst.new TreeNode(15);
		pwbst.root.left = pwbst.new TreeNode(10);
		pwbst.root.right = pwbst.new TreeNode(20);
		pwbst.root.left.left = pwbst.new TreeNode(8);
		pwbst.root.left.right = pwbst.new TreeNode(12);
		pwbst.root.right.left = pwbst.new TreeNode(16);
		pwbst.root.right.right = pwbst.new TreeNode(25);
		int sum = 28;
		boolean b = pwbst.pairWithGivenSum(pwbst.root, sum);
		System.out.println(b);
	}

}
