package binarytree;

public class RangeSumBST {

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

	public int rangeSumBST(TreeNode root, int L, int R) {

		
		if (root == null) 
			return 0;
		if(L<=root.val && root.val<=R) {
			return rangeSumBST(root.left, L, R)+rangeSumBST(root.right, L, R)+root.val;
		}
		else if (L>root.val) {
		return	rangeSumBST(root.left, L, R);	
		}
		else		
		return rangeSumBST(root.right, L, R);

	}

	public static void main(String[] args) {
		RangeSumBST rsbst = new RangeSumBST();
		rsbst.root = rsbst.new TreeNode(10);
		rsbst.root.left = rsbst.new TreeNode(5);
		rsbst.root.left.left = rsbst.new TreeNode(3);
		rsbst.root.left.right = rsbst.new TreeNode(7);
		rsbst.root.right = rsbst.new TreeNode(15);
		rsbst.root.right.right = rsbst.new TreeNode(18);
		int sum=rsbst.rangeSumBST(rsbst.root, 7, 15);
	    System.out.println(sum); 
	}
}
