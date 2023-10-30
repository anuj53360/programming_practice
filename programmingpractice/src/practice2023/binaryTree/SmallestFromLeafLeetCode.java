package programmingpractice.src.practice2023.binaryTree;

public class SmallestFromLeafLeetCode {

    public String smallestFromLeaf(TreeNode root) {

      return smallestFromLeafUtil(root , "");

    }

    private String smallestFromLeafUtil(TreeNode root, String suffix) {

     String current =  String.valueOf((char)('a'+ root.val)).concat(suffix);

     if(root.left == null && root.right == null){
         return current;
     }
     String left = null;
     String right = null;

     if(root.left!=null){
         left = smallestFromLeafUtil(root.left , current);
     }
     if (root.right!=null){
         right = smallestFromLeafUtil(root.right , current);
     }
     if (left !=null && right!= null){
         return  left.compareTo(right)<0?left:right;
     }
     else if (left == null){
         return  right;
     }
     else return left;
    }
}
