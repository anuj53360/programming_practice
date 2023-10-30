package programmingpractice.src.practice2023.binaryTree;

import java.util.Stack;

public class FlattenBinaryTreeLinkedList {

    public void flatten(TreeNode root) {

        if (root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode curr = stack.pop();

            if (curr.right !=null){
                stack.push(curr.right);
            }
            if (curr.left != null){
                stack.push(curr.left);
            }

            if (!stack.isEmpty()){
                curr.right = stack.peek();
                curr.left = null;
            }
        }
    }

    public static void main(String[] args) {

    }
}
