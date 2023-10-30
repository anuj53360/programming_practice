package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {


    public boolean isCompleteTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode prevNode = root;

        while (!queue.isEmpty()){
                TreeNode temp = queue.poll();
                if (temp != null){
                    if (prevNode == null){
                        return false;
                    }
                    if (temp.left !=null){
                        queue.add(temp.left);
                    }
                    if (temp.right !=null){
                        queue.add(temp.right);
                    }
                }
                prevNode = temp;
            }
        return  true;
    }

    public static void main(String[] args) {

    }
}
