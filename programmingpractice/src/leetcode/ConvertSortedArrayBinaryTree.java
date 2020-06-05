package leetcode;

public class ConvertSortedArrayBinaryTree {

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
       
        public TreeNode sortedArrayToBST(int[] nums) {
             if(nums.length==0) {
            	 return null;
             }
             
             TreeNode head=sortedArrayToBSTUtil(nums,0,nums.length-1);
             return head;
        }
	
       public TreeNode sortedArrayToBSTUtil(int []nums,int left,int right){
		   if(left>right) {
			   return null;
		   }
		   
		   int mid=left+(right-left)/2;
		   TreeNode newnode=new TreeNode(nums[mid]);
		   newnode.left=sortedArrayToBSTUtil(nums, left, mid-1);
		   newnode.right=sortedArrayToBSTUtil(nums, mid+1, right);
    	   return newnode;
        }
	
	public static void main(String[] args) {

	}

}
