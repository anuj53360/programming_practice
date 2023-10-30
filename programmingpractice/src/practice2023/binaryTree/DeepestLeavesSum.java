package programmingpractice.src.practice2023.binaryTree;

import programmingpractice.src.practice2023.binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null){
            return  root.val;
        }
       int sum =0;
       Queue<TreeNode> queue = new LinkedList<>();

       queue.add(root);
       while (!queue.isEmpty()){

           sum=0;
           int levels = queue.size();

           for (int i=0;i< levels;i++){

               TreeNode temp = queue.poll();
               if(temp.left == null && temp.right == null){
                   sum += temp.val;
               }

               if(temp.left != null ){
                   queue.add(temp.left);
               }
               if(temp.right != null ){
                   queue.add(temp.right);
               }
           }

           if (queue.isEmpty()){
               return sum;
           }
       }
        return  sum;
    }

    public static void main(String[] args) {

    }
}
