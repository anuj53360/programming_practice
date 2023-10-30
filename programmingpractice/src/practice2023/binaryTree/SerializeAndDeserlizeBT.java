package programmingpractice.src.practice2023.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserlizeBT {

    public String serialize(TreeNode root) {

        if (root == null){
            return  "";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb =new StringBuilder();

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();

            sb.append(temp.val).append(",");
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }

        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }


    public TreeNode deserialize(String data) {

        if (data  == null){
            return  null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        String []val = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        queue.add(root);

        for (int i=1;i<val.length;i++){
           addNode(root , Integer.parseInt(val[i]));
        }
  return root;
    }

    private void addNode(TreeNode root, int value) {
        TreeNode current = root;
        TreeNode prev = null;
        while (current != null){
            prev = current;
            current = (value <= current.val) ? current.left : current.right;
        }
        if (value <= prev.val) {
            prev.left = new TreeNode(value);
        } else {
            prev.right = new TreeNode(value);
        }
    }

    public static void main(String[] args) {

    }
}
