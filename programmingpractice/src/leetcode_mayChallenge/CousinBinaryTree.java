package leetcode_mayChallenge;

public class CousinBinaryTree {
      
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		int dia;
		
		Node(int data){
			dia=Integer.MAX_VALUE;
			this.data=data;
			left=null;
			right=null;
		}
	}
	
public static boolean isCousins(Node root, int x, int y) {
	int firstx=-1;
    int secondy=-1;
    int parentx=0;
    int parenty=0;
	      isPresent(root,0,x,y,firstx,secondy,parentx,parenty);
	
	      return ((firstx==secondy) && (parentx!=parenty));
    }
	
public static boolean isPresent(Node node,int dia,int x,int y,int firstx,int secondy,int parentx,int parenty){
	   
	if(node==null) {
		return false;
	}
	
	if(node.left!=null) {
	if(node.left.data==x) {
		parentx=node.data;
		firstx=dia+1;
	}
	else if(node.left.data==y) {
		parenty=node.data;
		secondy=dia+1;
	}}
	
	if(node.right!=null) {
		if(node.right.data==x) {
			parentx=node.data;
			firstx=dia+1;
		}
		else if(node.right.data==y) {
			parenty=node.data;
			secondy=dia+1;
		}}
	
	        isPresent(node.left, dia+1, x, y,firstx,secondy,parentx,parenty);
	        isPresent(node.right, dia+1, x, y,firstx,secondy,parentx,parenty);
	return false;
}




	
	public static void main(String[] args) {
		CousinBinaryTree cbt=new CousinBinaryTree();
		cbt.root=cbt.new Node(1);
		cbt.root.left=cbt.new Node(2);
		cbt.root.left.right=cbt.new Node(4);
		cbt.root.right=cbt.new Node(3);
		cbt.root.right=cbt.new Node(5);
		isCousins(cbt.root,5 ,4);
		
	}
}
