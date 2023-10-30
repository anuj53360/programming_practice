package programmingpractice.src.practice2023.binaryTree;

public class BinaryTreeColouring {

      int leftCount;
      int rightCount;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
      leftCount =0;
      rightCount =0;
      countSubTree(root , x);
      int parentNodesCount = n -(leftCount + rightCount + 1);
      int max = Math.max(parentNodesCount , Math.max(leftCount , rightCount));
      return max >(n/2);

    }

    private int countSubTree(TreeNode root, int x) {
        if (root == null){
            return  0;
        }
        int left = countSubTree(root.left , x);
        int right = countSubTree(root.right , x);
        if(root.val == x){
            leftCount = left;
            rightCount = right;
        }
        return  left + right +1;
    }

    public static void main(String[] args) {

    }
}

