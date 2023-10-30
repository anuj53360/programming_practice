package programmingpractice.src.practice2023.binaryTree;

import java.util.*;

public class BinaryTreeToBeInfected {

TreeNode infected;

    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode , TreeNode> map = new HashMap<>();
        buildParrent(root , start , null , map);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(infected);
        int minute =0;
        while (!queue.isEmpty()){
            int size = queue.size();
            minute++;

            for (int i=0; i< size;i++){
                TreeNode curr = queue.poll();
                set.add(curr.val);

                if (curr.left !=null && !set.contains(curr.left.val)){
                    queue.offer(curr.left);
                }
                if (curr.right !=null && !set.contains(curr.right.val)){
                    queue.offer(curr.right);
                }

                if (map.containsKey(curr) && map.get(curr) !=null && !set.contains(map.get(curr).val)){
                    queue.offer(map.get(curr));
                }
            }
        }
        return  minute-1;
    }

    private void buildParrent(TreeNode root, int start, TreeNode parrent, Map<TreeNode, TreeNode> map) {

        if (root == null){
            return;
        }

        if (root.val == start){
            infected = root;
        }
        map.put(root , parrent);
        if (root.left!=null){
            buildParrent(root.left , start ,root , map );
        }
        if (root.right!=null){
            buildParrent(root.right , start ,root , map );
        }

    }

    public static void main(String[] args) {

    }
}
