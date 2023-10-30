package programmingpractice.src.practice2023.binaryTree;

import java.util.Stack;

public class VerifyPreOrderSerlization {

    public boolean isValidSerialization(String preorder) {

        if(preorder == null){
            return false;
        }
        Stack<String> stack = new Stack<>();
        String []strs =  preorder.split(",");
    for(int i=0;i< strs.length;i++){
        String curr = strs[i];

        while (curr.equals("#") && !stack.isEmpty() && stack.peek().equals(curr)){
            stack.pop();
            if(stack.isEmpty()){
                return  false;
            }
            stack.pop();
        }
        stack.push(curr);
    }


return  stack.size() == 1 && stack.peek().equals("#");
    }
    public static void main(String[] args) {

    }
}
