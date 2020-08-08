package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNodeAtLevel {

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	  public int maxNodeLevel(Node root) {
		   Queue<Node> queue=new LinkedList<>();
		   queue.add(root);
		   int level=0;
		   int maxlevel=0;
		   int max=Integer.MIN_VALUE;
		   
		   
		   while(true) {
			   int nodecount=queue.size();
			   
			   if(nodecount>max) {
				   max=nodecount;
				   maxlevel=level;
			   }
			   
			   while(nodecount>0) {
				   Node temp=queue.peek();
				   queue.remove();
				   if(temp.left!=null)
					   queue.add(temp.left);
				   if(temp.right!=null)
					   queue.add(temp.right);
                   nodecount--;				   
			   }
			   level++;
		   }
		 
	   }
	

	public static void main(String[] args) {

		MaxNodeAtLevel maxnode = new MaxNodeAtLevel();
		Node root = maxnode.new Node(2);
		root.left = maxnode.new Node(1);
		root.right = maxnode.new Node(3);
		root.left.left = maxnode.new Node(4);
		root.left.right = maxnode.new Node(6);
		root.right.right = maxnode.new Node(8);
		root.left.right.left = maxnode.new Node(5);
	}
}
