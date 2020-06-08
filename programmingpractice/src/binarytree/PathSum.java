package binarytree;

public class PathSum {

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

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root ==null)
			return false;
		if(root.left==null && root.right==null && root.val==sum)
			return true;
		return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
	}

	public static void main(String[] args) {

	}

}
