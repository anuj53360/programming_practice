package programmingpractice.src.practice2023.binaryTree;

public class RecoverBSTLeetCode99 {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode sec = null;

    public void recoverTree(TreeNode root) {
        recover(root);
        swap(first , sec);
        return;
    }

    private void swap(TreeNode first, TreeNode sec) {

       int temp = first.val;
       first.val = sec.val;
       sec.val = temp;
    }

    private void recover(TreeNode root) {
        if (root == null){
            return;
        }

        recover(root .left);
        if (prev !=null && prev.val > root.val){
            if (first == null){
                first  = prev;
            }
            sec = root;
        }
        prev = root;
        recover(root.right);
    }

    public static void main(String[] args) {

    }
}
