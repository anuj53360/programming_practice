package programmingpractice.src.practice2023.binaryTree;

import programmingpractice.src.practice2023.dp.maximalSquare;

public class MaximumProductSplittedBTLeetCode {

    long sum =0;
    long maxProduct = 0;
    public int maxProduct(TreeNode root) {

        dfs(root);
        maxProductBinaryTree(root);
        return  (int)(maxProduct % 1000000007);
    }

    private void dfs(TreeNode root) {
        if (root == null){
            return;
        }
        dfs(root.left);
        dfs(root.right);
        sum += root.val;
    }

    private long maxProductBinaryTree(TreeNode root) {
    if (root == null){
        return  0;
    }
   long l =   maxProductBinaryTree(root.left);
        long r =   maxProductBinaryTree(root.right);
        long subTreeSum = l+r + root.val;
        maxProduct = Math.max(maxProduct , (subTreeSum)* (sum-subTreeSum));
    return  subTreeSum;
    }

    public static void main(String[] args) {

    }
}
