package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalBinartTree {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	   public TreeNode(int val) {
		left=null;
		right=null; 
	}
	}
	
	TreeNode root;
	
     public List<List<Integer>> levelOrder(TreeNode root) {
          Queue<TreeNode> queue=new LinkedList<TreeNode>();          
    	 List<Integer> list=new ArrayList<>();
    	 List<List<Integer>> list1=new ArrayList<>();
    	 if(root==null) {
    		 return list1;
    	 }
    	if(root!=null) {	 
    	 queue.add(root);
    	}
    	 System.out.println(queue.peek());
    	 System.out.println(root.val);
    	 while(!queue.isEmpty()) {
    		 TreeNode node=queue.poll();
    		 System.out.println(node.val);
    		 list.add(node.val);
    		 if(node.left!=null) {
    			 queue.add(node.left);
    		 }
    		 if(node.right!=null) {
    			 queue.add(node.right);
    		 }
    		 list1.add(list);
    	 }
    	 return list1;
    }
	   
	
	public static void main(String[] args) {
		LevelOrderTraversalBinartTree lotb=new LevelOrderTraversalBinartTree();
		lotb.root=lotb.new TreeNode(3);
		lotb.root.left=lotb.new TreeNode(9);
		lotb.root.right=lotb.new TreeNode(20);
		lotb.root.right.left=lotb.new TreeNode(15);
		lotb.root.right.right=lotb.new TreeNode(7);
		lotb.levelOrder(lotb.root);
				
	}
}
