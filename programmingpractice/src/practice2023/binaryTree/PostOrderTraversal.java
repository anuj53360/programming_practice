package programmingpractice.src.practice2023.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp);

            if(temp.left !=null){
                stack1.push(temp.left);
            }
            if (temp.right !=null){
                stack1.push(temp.right);
            }
        }

        while (!stack2.isEmpty()){
            TreeNode temp = stack2.peek();
            list.add(temp.val);
            stack2.pop();
        }

        return list;
    }

    public static void main(String[] args) {

    }
}
