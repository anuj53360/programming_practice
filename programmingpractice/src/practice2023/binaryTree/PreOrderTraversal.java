package programmingpractice.src.practice2023.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null){
             return list;
        }

        stack.push(root);
        while (!stack.isEmpty()){

            TreeNode temp = stack.peek();
              stack.pop();
              list.add(temp.val);

              if (temp.right !=null){
                  stack.push(temp.right);
              }

              if (temp.left !=null){
                  stack.push(temp.left);
              }
        }
    return list;
    }

    public static void main(String[] args) {

    }
}
