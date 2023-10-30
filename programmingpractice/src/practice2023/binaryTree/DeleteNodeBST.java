package programmingpractice.src.practice2023.binaryTree;

public class DeleteNodeBST {

    /**
     * First searching a node.
     * Then we are deleting
     *
     * @param key
     * @return
     */

    public TreeNode deleteNode(TreeNode root, int key) {
       if(root == null){
           return null;
       }
       if(root.val == key){
           return deleteNodeUtil(root);
       }

       TreeNode temp = root;
       while (root != null){
           if (root.val > key){
               if (root.left !=null && root.left.val == key){
                   root.left = deleteNodeUtil(root.left);
               }else {
                   root = root.left;
               }
           }
           else {
               if (root.right != null && root.right.val == key){
                   root.right = deleteNodeUtil(root.right);
               }else {
                   root = root.right;
               }
           }
       }
       return temp;
    }

    private TreeNode deleteNodeUtil(TreeNode root) {
     if(root.left == null){
         return  root.right;
     }
     if (root.right == null){
         return  root.left;
     }else {
         TreeNode rightChild = root.right;
         TreeNode lastRight = findLastRight(root.left);
         lastRight.right = rightChild;
         return  root.left;
     }

    }

    private TreeNode findLastRight(TreeNode root) {
    if(root.right == null){
        return  root;
    }
    return  findLastRight(root.right);
    }


    public static void main(String[] args) {

    }
}
