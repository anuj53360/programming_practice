package leetcode;

import java.util.Stack;

public class BSTFromPreorder {

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

	

	public TreeNode bstFromPreorder(int[] preorder) {
              Stack<TreeNode> stack=new Stack<>();
              
             TreeNode root=new TreeNode(preorder[0]);
             stack.push(root);
		     for (int i = 1; i < preorder.length; i++) {
				TreeNode temp=null;
				
				while(!stack.isEmpty() && preorder[i] > stack.peek().val) {
					temp=stack.pop();
				}
				
				if(temp!=null) {
					temp.right=new TreeNode(preorder[i]);
					stack.push(temp.right);
				}else {
					temp=stack.peek();
					temp.left=new TreeNode(preorder[i]);
					stack.push(temp.left);
				}
		    	 
			}
		return root;
	}

	public static void main(String[] args) {

	}

}
