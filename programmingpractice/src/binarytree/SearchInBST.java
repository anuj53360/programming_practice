package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInBST {

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

	public TreeNode searchBST(TreeNode root, int val) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.peek();

			if (temp.val == val) {
				return temp;
			}
			queue.poll();
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
		return root;
	}

	public static void main(String[] args) {
		SearchInBST searchbst = new SearchInBST();
		int val = 2;
		searchbst.root = searchbst.new TreeNode(4);
		searchbst.root.left = searchbst.new TreeNode(2);
		searchbst.root.right = searchbst.new TreeNode(7);
		searchbst.root.left.left = searchbst.new TreeNode(1);
		searchbst.root.left.right = searchbst.new TreeNode(3);
		searchbst.searchBST(searchbst.root, val);
	}
}
