package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointer {

    public TreeNode connect(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(i<size-1){
                    temp.next = queue.peek();
                }

                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }

        }



return root;
    }

    public static void main(String[] args) {

    }
}

