package binarytree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorBT {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			left = null;
			right = null;
		}
	}

	TreeNode root;

	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	public int lowestCommonAncestor(TreeNode root, int n1, int n2) {
		if (!(lowestCommonAncesstorUtil(root, n1, list1)) && !(lowestCommonAncesstorUtil(root, n1, list1)))
			return -1;
		int i;
		for (i = 0; i < list1.size() && i < list2.size(); i++) {
			if (list1.get(i) != list2.get(i)) {
				break;
			}
		}

		return list1.get(i - 1);
	}

	private boolean lowestCommonAncesstorUtil(TreeNode root, int n1, List<Integer> list) {

		if (root == null)
			return false;

		list.add(root.val);

		if (root.val == n1)
			return true;

		if ((root.left != null) && lowestCommonAncesstorUtil(root.left, n1, list))
			return true;

		if ((root.right != null) && lowestCommonAncesstorUtil(root.right, n1, list))
			return true;

		return false;
	}

	public static void main(String[] args) {
		LowestCommonAncestorBT lcabt = new LowestCommonAncestorBT();
		lcabt.root = lcabt.new TreeNode(1);
		lcabt.root.left = lcabt.new TreeNode(2);
		lcabt.root.right = lcabt.new TreeNode(3);
		lcabt.root.left.left = lcabt.new TreeNode(4);
		lcabt.root.left.right = lcabt.new TreeNode(5);
		lcabt.root.right.left = lcabt.new TreeNode(6);
		lcabt.root.right.right = lcabt.new TreeNode(7);
		lcabt.lowestCommonAncestor(lcabt.root, 4, 3);
	}
}
