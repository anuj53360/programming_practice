package binarytree;

public class SameTree {

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

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;
		if ((p == null && q != null) || (q != null && q == null))
			return false;
		if (p.val != q.val)
			return false;
		return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	}

	public static void main(String[] args) {

	}
}
