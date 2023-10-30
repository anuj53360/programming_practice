package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTreeLeetCode1609 {

    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return true;
        }
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            int oddLeve = Integer.MAX_VALUE;
            int evenleve = Integer.MIN_VALUE;
            while (size >0){
                TreeNode temp = queue.poll();
                if (level %2 == 1){

                    if (temp.val %2 ==1 || oddLeve <= temp.val){
                        return false;
                    }
                    oddLeve = temp.val;
                }else {
                    if (temp.val %2 ==0 || evenleve >= temp.val){
                        return false;
                    }
                    evenleve = temp.val;
                }

                if (temp.left != null){
                    queue.add(temp.left );
                }else if (temp.right != null){
                    queue.add(temp.right);
                }
                --size;
            }
            ++level;
        }
return true;
    }


    public static void main(String[] args) {

    }
}
