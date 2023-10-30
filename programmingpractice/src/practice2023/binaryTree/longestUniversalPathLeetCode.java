package programmingpractice.src.practice2023.binaryTree;

import programmingpractice.src.practice2023.binaryTree.TreeNode;

public class longestUniversalPathLeetCode {

    int maxVal = 0;
    public int longestUnivaluePath(TreeNode root) {
          if (root == null){
              return  0;
          }
          longestUnivaluePathUtil(root , root.val);

        return  maxVal;
    }

    private int longestUnivaluePathUtil(TreeNode root, int prevValue) {

    if(root == null){
        return 0;
    }
    int left = longestUnivaluePathUtil(root.left , root.val);
    int right = longestUnivaluePathUtil(root.right , root.val);

    maxVal = Math.max(maxVal , left+right);
    if (root.val == prevValue){
        return  Math.max(left , right)+1;
    }
    return  0;
    }

    public static void main(String[] args) {

    }
}
