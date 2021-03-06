package leetcode;

public class ValidateBST {

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

	
	
	 public boolean isValidBST(TreeNode root) {
              int min=Integer.MIN_VALUE;
              int max=Integer.MAX_VALUE;
              return isVlidBST(root,min,max);
	    }
	
	 public boolean isVlidBST(TreeNode root,int min,int max){
		 
		 if(root== null) {
       	  return true;
         }
		 if(root.val<min || root.val>max) {
			 return false;
		 }
		return isVlidBST(root.left,min,root.val-1) &&
		 isVlidBST(root.right,root.val-1,max);
		 
	 }
	 
	public static void main(String[] args) {
		
	}
}
