package leetcode;

public class MaxDepthHeightBinaryTree {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
			left=null;
			right=null;
		}
	}
	TreeNode root;
	
public int maxDepth(TreeNode root) {

	if(root==null) {
		return 0;
	}
	else {
	int lheight=maxDepth(root.left);
	int rheight=maxDepth(root.right);
	if(lheight>rheight) {
		return lheight+1;
	}else {
		return rheight+1;
	}
	}
	//return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	
    }
	
	
	public static void main(String[] args) {
		MaxDepthHeightBinaryTree maxdbt=new MaxDepthHeightBinaryTree();
		maxdbt.root=maxdbt.new TreeNode(3);
		maxdbt.root.left=maxdbt.new TreeNode(9);
		maxdbt.root.right=maxdbt.new TreeNode(20);
		maxdbt.root.right.left=maxdbt.new TreeNode(15);
		maxdbt.root.right.right=maxdbt.new TreeNode(7);
		int x=maxdbt.maxDepth(maxdbt.root);
	    System.out.println(x);
	}
}
