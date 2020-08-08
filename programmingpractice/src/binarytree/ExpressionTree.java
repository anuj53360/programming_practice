package binarytree;

import java.util.Stack;

public class ExpressionTree {

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

	Node constructTreeExpression(char []chararray) {
		
		Stack<Node> stack=new Stack<>();
		Node t,t1,t2;
		
		for (int i = 0; i < chararray.length; i++) {
			
			if(!isOperator(chararray[i])) {
				t=new Node(chararray[i]);
				stack.push(t);
			}else {
				t=new Node(chararray[i]);
				t1=stack.pop();
				t2=stack.pop();
				
				t.right=t1;
				t.left=t2;
				
				stack.push(t);
			}
		}
      
		t=stack.peek();
		stack.pop();
		return t;
		
	}

	public boolean isOperator(char expression) {

		if (expression == '*' || expression == '+' || expression == '-' || expression == '/') {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ExpressionTree tree = new ExpressionTree();
		String expression = "ab+ef*g*-";
		char[] chararray = expression.toCharArray();
		tree.constructTreeExpression(chararray);

	}
}
