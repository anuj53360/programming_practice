package leetcode;

public class DiameterBinaryTree {

	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	TreeNode root;
int diameter=0;
	 public int diameterOfBinaryTree(TreeNode root) {
	TreeNode node=root;
		
	if(node==null) {
		return 0;
	}
	
	if(node.left==null && node.right==null) {
		return 1;
	}
	int lheight=diameterOfBinaryTree(node.left);
	int rheight=diameterOfBinaryTree(node.right);
	
	diameter=Math.max(diameter, lheight+rheight+1);
	
		System.out.println(diameter+"aaaa"); 
		 return Math.max(lheight, rheight)+1;
	    }
	 
	
	 
	 
	 public int heightofBinaryTree(TreeNode root) {
		 TreeNode node=root;
		 if(node==null) {
			 return 0;
		 }
		 int lheight=heightofBinaryTree(node.left);
		 int rheight=heightofBinaryTree(root.right);
		 
		 if(lheight>rheight)
			 return lheight+1;
		 else {
			return rheight+1; 
		 }
	 
	 }
	 
	
	
	public static void main(String[] args) {
		
		DiameterBinaryTree dbt=new DiameterBinaryTree();
		dbt.root=dbt.new TreeNode(1);
		dbt.root.left=dbt.new TreeNode(2);
//		dbt.root.left.left=dbt.new TreeNode(4);
//		dbt.root.left.right=dbt.new TreeNode(5);
//		dbt.root.right=dbt.new TreeNode(3);
		int t=dbt.diameterOfBinaryTree(dbt.root);
		int x=dbt.heightofBinaryTree(dbt.root);
		System.out.println(t+" "+x);
		
	}
}
