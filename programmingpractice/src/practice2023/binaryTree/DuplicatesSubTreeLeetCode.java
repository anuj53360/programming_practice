package programmingpractice.src.practice2023.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesSubTreeLeetCode {

    Map<String , Integer> map = new HashMap<>();
    List<TreeNode> list =new ArrayList<>();


    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        mapper(root);
        return  list;

    }

    private String mapper(TreeNode root) {
        if(root == null){
            return "N";
        }
        String left = mapper(root.left);
        String right = mapper(root.right);

        String curr = root.val+" "+left+" "+right;
        map.put(curr , map.getOrDefault(curr ,0)+1);
        if (map.get(curr) == 2){
            list.add(root);
        }
        return  curr;
    }

    public static void main(String[] args) {

    }
}
