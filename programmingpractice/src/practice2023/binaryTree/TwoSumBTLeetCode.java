package programmingpractice.src.practice2023.binaryTree;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TwoSumBTLeetCode {

    public boolean findTarget(TreeNode root, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            int minusValue = k - temp.val;
            if(map.containsKey(minusValue)){
                return true;
            }else{
                map.put(temp.val , temp.val);
            }

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right!= null){
                queue.add(temp.right);
            }
        }


return false;
    }

    public static void main(String[] args) {
//       char []root = {5,3,6,2,4,null,7};
       int k = 9;
    }
}
