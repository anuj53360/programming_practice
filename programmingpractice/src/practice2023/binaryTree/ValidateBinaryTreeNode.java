package programmingpractice.src.practice2023.binaryTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ValidateBinaryTreeNode {

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        int root  = findRoot(n , leftChild , rightChild);
        if(root == -1){
            return  false;
        }
        return  validateBinaryTreeNodesBFS(n , leftChild , rightChild , root);
    }

    private boolean validateBinaryTreeNodesBFS(int n, int[] leftChild, int[] rightChild, int root) {

        Queue<Integer> queue = new LinkedList<>();
        boolean []visited = new boolean[n];
        queue.add(root);
        while (!queue.isEmpty()){
            int node = queue.remove();
            if(visited[node]){
                return  false;
            }
            visited[node] = true;

            if(leftChild[node] != -1){
                queue.add(leftChild[node]);
            }

            if (rightChild[node] != -1){
                queue.add(rightChild[node]);
            }
        }
        for (boolean v :visited) {
            if (!v){
                return  false;
            }
        }

        return  true;
    }

    private int findRoot(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<n ;i++){
            set.add(i);
        }
        for (int ch: leftChild) {
            set.remove(ch);
        }

        for ( int ch:rightChild) {
            set.remove(ch);
        }
        return set.size() == 1 ? set.iterator().next() : -1;

    }

    public static void main(String[] args) {
        ValidateBinaryTreeNode vb = new ValidateBinaryTreeNode();
        int n = 4;
        int[] leftChild = {1, -1, 3, -1};
        int[] rightChild = {2, -1, -1, -1};
        vb.validateBinaryTreeNodes(n, leftChild, rightChild);

    }
}
