package binarytree;

public class CheckBSTorNot {

	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	Node root;
	
	public boolean checkBstorNot(Node node,int min,int max) {
		if(node==null) {
			return true;
		}
		if(node.data>max && node.data<min) {
		return false;
		}
		return checkBstorNot(node.left,Integer.MIN_VALUE,node.data-1) &&
		 checkBstorNot(node.right,node.data+1,Integer.MAX_VALUE);
		
	}
	
	
	public boolean printtreeUtil() {
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		 return checkBstorNot(root,min,max);
	}
	
	public static void main(String[] args) {
		CheckBSTorNot tree = new CheckBSTorNot(); 
	        tree.root = tree.new Node(4); 
	        tree.root.left = tree.new Node(2); 
	        tree.root.right = tree.new Node(5); 
	        tree.root.left.left = tree.new Node(1); 
	        tree.root.left.right = tree.new Node(3);
	        if (tree.printtreeUtil()) 
	            System.out.println("IS BST"); 
	        else
	            System.out.println("Not a BST"); 
	    }
	
	}

