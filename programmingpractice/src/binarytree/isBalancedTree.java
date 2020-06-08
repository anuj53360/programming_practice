package binarytree;

public class isBalancedTree {

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
	boolean isbalanced = true;

	public boolean isBalanced(TreeNode root) {

		maxdepth(root);

		return isbalanced;
	}

	public int maxdepth(TreeNode root) {
		if (root == null)
			return 0;

		int lheight = maxdepth(root.left);
		int rheight = maxdepth(root.right);
		if (Math.abs(lheight - rheight) > 1)
			isbalanced = false;
		return 1 + Math.max(lheight, rheight);

	}

	public static void main(String[] args) {

	}
}
