package binarytree;

import java.util.Stack;

public class SpiralFormLevelOrder {
          
	Node root;
	
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public void spiralFormLevelOrder() {
		
		Stack<Node> stack1=new Stack<>();
		Stack<Node> stack2=new Stack<>();
		
		stack1.push(root);
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
		while(!stack1.isEmpty()) {
			Node temp=stack1.peek();
		       stack1.pop();
			   System.out.println(temp.data);
		       if(temp.right!=null) {
		    	   stack2.push(temp.right);
		       }
			
		       if(temp.left!=null) {
		    	   stack2.push(temp.left);
		       }
		}
		
		
		while(!stack2.isEmpty()) {
			Node temp=stack2.peek();
			stack2.pop();
			System.out.println(temp.data);
			if(temp.left!=null) {
				stack1.push(temp.left);
			}
			if(temp.right!=null) {
				stack1.push(temp.right);
			}
		}
		
		}
		
		
	}
	
	public static void main(String[] args) {
        SpiralFormLevelOrder sflo=new SpiralFormLevelOrder();
        sflo.root = sflo.new Node(1); 
        sflo.root.left = sflo.new Node(2); 
        sflo.root.right = sflo.new Node(3); 
        sflo.root.left.left = sflo.new Node(7); 
        sflo.root.left.right = sflo.new Node(6); 
        sflo.root.right.left = sflo.new Node(5); 
        sflo.root.right.right = sflo.new Node(4);
        sflo.spiralFormLevelOrder();
		
		
	}
}
