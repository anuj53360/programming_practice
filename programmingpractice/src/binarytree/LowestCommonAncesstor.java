package binarytree;

public class LowestCommonAncesstor {

	Node root;
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
	
	public Node lowestCommonAncesstor(Node root,int n1,int n2) {
        
		if(root==null) {
			return null;
		}
		
		if(root.data>n1 && root.data>n2) {
			return lowestCommonAncesstor(root.left, n1, n2);
		}
		
		if(root.data<n1 && root.data<n2) {
			return lowestCommonAncesstor(root.right, n1, n2);
		}
		return root;
	}
	
	public static void main(String[] args) {
		LowestCommonAncesstor lowestca=new LowestCommonAncesstor();
		lowestca.root = lowestca.new Node(20); 
		lowestca.root.left = lowestca.new Node(8); 
		lowestca.root.right = lowestca.new Node(22); 
		lowestca.root.left.left = lowestca.new Node(4); 
		lowestca.root.left.right = lowestca.new Node(12); 
		lowestca.root.left.right.left = lowestca.new Node(10); 
		lowestca.root.left.right.right = lowestca.new Node(14); 
        
		 int n1 = 10, n2 = 14; 
	        Node t = lowestca.lowestCommonAncesstor(lowestca.root, n1, n2); 
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
		
	}
}
