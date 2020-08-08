package binarytree;

import java.util.ArrayList;
import java.util.List;


public class KDistanceAprartNode {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	TreeNode root;
	List<Integer> list = new ArrayList<>();
	public List<Integer> kdistanceApart(TreeNode root, int k) {
		
		if (root == null)
			return null;

		if (k == 0) {
			list.add(root.data);
		}
		kdistanceApart(root.left, k - 1);
		kdistanceApart(root.right, k - 1);
		return list;
	}

	public static void main(String[] args) {
		KDistanceAprartNode lan = new KDistanceAprartNode();
		lan.root = lan.new TreeNode(20);
		lan.root.left = lan.new TreeNode(8);
		lan.root.right = lan.new TreeNode(22);
		lan.root.left.left = lan.new TreeNode(5);
		lan.root.left.right = lan.new TreeNode(3);
		lan.root.right.right = lan.new TreeNode(25);
             List<Integer> list=lan.kdistanceApart(lan.root,2);
	     for (Integer integer : list) {
			System.out.println(integer);
		}
	}


	}

