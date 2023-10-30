package programmingpractice.src.practice2023.binaryTree;

import java.util.*;

public class DistanceKBinaryTree {


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode , TreeNode> parrentMap = new HashMap<>();
        findParrentNode(root , parrentMap);
        Map<TreeNode , Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        visited.put(target , true);
        queue.offer(target);
        int level =0;

        while (!queue.isEmpty()){
            int n = queue.size();
            if (level == k){
                break;
            }
            level++;
           while (n-- > 0){
               TreeNode curr = queue.poll();

               if (curr.left != null && !visited.containsKey(curr.left)){
                   visited.put(curr.left , true);
                   queue.offer(curr.left);
               }
               if (curr.right != null && !visited.containsKey(curr.right)){
                   visited.put(curr.right , true);
                   queue.offer(curr.right);
               }
               if (parrentMap.containsKey(curr) && !visited.containsKey(parrentMap.get(curr))){
                   visited.put(parrentMap.get(curr) , true);
                   queue.offer(parrentMap.get(curr));
               }


           }

        }

        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            ans.add(queue.poll().val);
        }

return  ans;
    }

    private void findParrentNode(TreeNode root , Map<TreeNode , TreeNode> parrentMap) {
        if (root == null){
            return;
        }
        if (root.left !=null){
            parrentMap.put(root.left , root);
        }
        if (root.right !=null){
            parrentMap.put(root.right , root);
        }

        findParrentNode(root.left , parrentMap);
        findParrentNode(root.right , parrentMap);
    }

    public static void main(String[] args) {

    }
}
