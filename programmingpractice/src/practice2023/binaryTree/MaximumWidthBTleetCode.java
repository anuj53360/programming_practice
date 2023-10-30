package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthBTleetCode {

    public int widthOfBinaryTree(TreeNode root) {
     int result =0;
     if(root == null){
         return 0;
     }
        Queue<Pair> queue = new LinkedList<>();
     queue.add(new Pair(root ,0));
     while (!queue.isEmpty()){
         int size = queue.size();
         int min = queue.peek().num;
         int first = 0;
         int last = 0;
         for (int i=0; i< size ;i++){
             int crrid = queue.peek().num-min;
             TreeNode node = queue.peek().node;

             queue.poll();
             if (i == 0){
                 first = crrid;
             }
             if (i == size-1){
                 last = crrid;
             }

             if(node.left!= null){
                 queue.offer(new Pair(node.left , 2*crrid+1));
             }
             if (node.right != null){
                 queue.offer(new Pair(node.right , 2*crrid+2));
             }
         }
         result = Math.max(result , last-first+1);
     }

        return  result;
    }

    public static void main(String[] args) {

    }
}



class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node , int num){
        this.node = node;
        this.num = num;
    }
}