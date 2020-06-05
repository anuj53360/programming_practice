package binarytree;

import java.util.Stack;

public class InorderTraversal {
     
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
		
	}
	
	Node root;
	
	public void inOrderTraversal() {
		if(root==null) {
			return;
		}
		Node curr=root;
		Stack<Node> stack=new Stack<>();
		while(curr!=null || stack.size()>0) {
			
			while(curr!=null) {
				stack.push(curr);
				curr=curr.left;
			}
			curr=stack.pop();
			System.out.println(curr.data);
			curr=curr.right;
		}
	}
	
	public static void main(String[] args) {
		InorderTraversal inorder=new InorderTraversal();
		inorder.root = inorder.new Node(1); 
		inorder.root.left = inorder.new Node(2); 
		inorder.root.right = inorder.new Node(3); 
		inorder.root.left.left = inorder.new Node(4); 
		inorder.root.left.right = inorder.new Node(5); 
		inorder.inOrderTraversal();
	}
}
