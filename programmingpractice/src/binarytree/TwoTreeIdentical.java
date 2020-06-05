package binarytree;

public class TwoTreeIdentical {
      
	Node root1;
	Node root2;
	
	class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}

	public boolean twoTreeIdentical(Node root1,Node root2) {
		
		if(root1==null && root2==null) {
			return true;
		}
		
		if(root1!=null && root2!=null) {
			return (root1.data == root2.data && twoTreeIdentical(root1.left, root2.left) && twoTreeIdentical(root1.right, root2.right));
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
        TwoTreeIdentical twti=new TwoTreeIdentical();		
	
        twti.root1 = twti.new Node(1); 
        twti.root1.left = twti.new Node(2); 
        twti.root1.right = twti.new Node(3); 
        twti.root1.left.left = twti.new Node(4); 
        twti.root1.left.right = twti.new Node(5); 
   
        twti.root2 = twti.new Node(1); 
        twti.root2.left = twti.new Node(2); 
        twti.root2.right = twti.new Node(3); 
        twti.root2.left.left = twti.new Node(4); 
        twti.root2.left.right = twti.new Node(5); 
        twti.twoTreeIdentical(twti.root1,twti.root2);
	}
}
