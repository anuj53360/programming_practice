package binarytree;

class  Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}

public class LeftViewBinaryTree {
     Node root;
     int maxlevel=0;
     public void leftViewBinaryTree(Node root,int level) {
         Node temp=root;       	 
         if(temp==null) {
    		 return;
    	 }
    	
         if(maxlevel<level) {
        System.out.println(temp.data);
        	 maxlevel=level;
         }
    	 
         leftViewBinaryTree(temp.left, level+1);
         leftViewBinaryTree(temp.right, level+1);
    	 
     }
     
public void leftViewBinaryTreeUtil() {
	leftViewBinaryTree(root,1);
     }
     
     public static void main(String[] args) {
    	 LeftViewBinaryTree lvbt=new LeftViewBinaryTree();
    	 lvbt.root=new Node(12);
    	 lvbt.root.left=new Node(10);
    	 lvbt.root.right=new Node(30);
    	 lvbt.root.right.left=new Node(25);
    	 lvbt.root.right.right=new Node(40);
    	 lvbt.leftViewBinaryTreeUtil();
     
     
     }
	
	
}
