package programmingpractice.src.practice2023.binaryTree;

/**
 * We will do DFS on every node.And then check
 * if currentSum becoming equal to pathSum
 */
public class PathSumThreeLeetCode {

int counter =0;
    public int pathSum(TreeNode root, int targetSum) {

        if (root == null){
            return  0;
        }
        pathSumUtil(root , targetSum , 0);
        pathSum(root.left , targetSum);
        pathSum(root.right , targetSum);




    return  counter;
    }

    private void pathSumUtil(TreeNode root, int targetSum, int currentSum) {
     if (root == null){
         return;
     }
     currentSum += root.val;

     if (currentSum == targetSum){
         counter++;
     }

     pathSumUtil(root.left , targetSum , currentSum);
        pathSumUtil(root.right , targetSum , currentSum);

    }

    public static void main(String[] args) {

    }
}
