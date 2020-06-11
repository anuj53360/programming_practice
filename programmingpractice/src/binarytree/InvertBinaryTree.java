package binarytree;

import java.util.ArrayList;

public class InvertBinaryTree {

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

	public TreeNode invertTree(TreeNode root) {

		if (root == null)
			return null;

		TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null || root.right!=null) {
        invertTree(root.left);
        invertTree(root.right);
        }
		return root;
	}

	public static void main(String[] args) {
		InvertBinaryTree inbt = new InvertBinaryTree();
		inbt.root = inbt.new TreeNode(4);
		inbt.root.left = inbt.new TreeNode(2);
		inbt.root.right = inbt.new TreeNode(7);
		inbt.root.left.left = inbt.new TreeNode(1);
		inbt.root.left.right = inbt.new TreeNode(3);
		inbt.root.right.left = inbt.new TreeNode(6);
		inbt.root.right.right = inbt.new TreeNode(9);
		
	}
}
