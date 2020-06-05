package leetcode;

public class SymmetricBinaryTree {
     
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			left=null;
			right=null;
		}
	}
	
	
    public boolean isSymmetric(TreeNode root) {
    	return isSymmetricUtil(root,root);
    }
	
    public boolean isSymmetricUtil(TreeNode node1,TreeNode node2){
    	if(node1==null && node2==null) {
    		return true;
    	}
    	if((node1!=null && node2!=null) &&(node1.val==node2.val)) {
    		return isSymmetricUtil(node1.left,node2.right) &&
    				isSymmetricUtil(node1.right, node2.left);
    	}
    	return false;
    }
    
    
	public static void main(String[] args) {
		
	}
}
