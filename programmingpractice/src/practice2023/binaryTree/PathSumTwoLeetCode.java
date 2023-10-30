package programmingpractice.src.practice2023.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwoLeetCode {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        pathSumUtil(root ,  targetSum , 0 , tempList , list);
        return list;
    }

    private void pathSumUtil(TreeNode root, int targetSum, int currSum, List<Integer> tempList, List<List<Integer>> list) {
        if(root == null){
        return;
    }
        currSum += root.val;

    if(root.left != null && root.right !=null && currSum == targetSum){
        list.add(tempList);
    }
    pathSumUtil(root.left , targetSum , currSum , tempList , list);
    pathSumUtil(root.right , targetSum , currSum , tempList , list);

        tempList.remove(tempList.size()-1);
    }

    public static void main(String[] args) { }
}
