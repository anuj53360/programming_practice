package binarytree;

import java.util.LinkedList;
import java.util.Stack;

public class SubTreeOfAnotherTree {

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

	public boolean isSubtree(TreeNode s, TreeNode t) {

		Stack<TreeNode> stack = new Stack<>();
		boolean same = false;
		stack.push(s);

		while (!stack.isEmpty() && !same) {

			TreeNode temp = stack.pop();
			
			if (temp.val == t.val) {
				same = isSame(temp, t);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}

			if (temp.right != null)
				stack.push(temp.right);
		}
		return same;
	}

	private boolean isSame(TreeNode temp, TreeNode t) {

		Stack<TreeNode> stack = new Stack<>();
		stack.push(temp);
		stack.push(t);

		while (!stack.isEmpty()) {
                  
			TreeNode x=stack.pop();
			TreeNode y=stack.pop();
			
			if (x== null && y == null) {
				 continue;
			}

			if (x == null || y == null)
				return false;
		
		if(x.val != y.val) {
			return false;
		}
		
		stack.push(x.left);
		stack.push(y.left);
		stack.push(x.right);
		stack.push(y.right);
		
		}
		return true;
	}

	public static void main(String[] args) {
		SubTreeOfAnotherTree atat = new SubTreeOfAnotherTree();
		atat.root = atat.new TreeNode(3);
		atat.root.left = atat.new TreeNode(4);
		atat.root.right = atat.new TreeNode(5);
		atat.root.left.left = atat.new TreeNode(1);
		atat.root.left.right = atat.new TreeNode(2);

		SubTreeOfAnotherTree atat1 = new SubTreeOfAnotherTree();
		atat1.root = atat1.new TreeNode(4);
		atat1.root.left = atat1.new TreeNode(1);
		atat1.root.right = atat1.new TreeNode(2);

		SubTreeOfAnotherTree atat2 = new SubTreeOfAnotherTree();
		boolean x= atat2.isSubtree(atat.root, atat1.root);
       System.out.println(x);
	}
}
