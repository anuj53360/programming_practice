package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRow {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return  newRoot;
        }
        bfs(root , val , depth);
        return  root;
    }

    private void bfs(TreeNode root, int val, int depth) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        for (int i=0;i<depth-2;i++){
            int size = queue.size();
            for(int j=0;j<size;j++){

                TreeNode curr = queue.poll();

                if (curr.left!= null){
                    queue.add(curr.left);
                }
                if (curr.right !=null){
                    queue.add(curr.right);
                }
            }
        }


        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            TreeNode temp = curr.left;
            curr.left = new TreeNode(val);
            curr.left.left = temp;

             temp = curr.right;
            curr.right = new TreeNode(val);
            curr.right.right = temp;
        }
    }

    public static void main(String[] args) {

    }

}
