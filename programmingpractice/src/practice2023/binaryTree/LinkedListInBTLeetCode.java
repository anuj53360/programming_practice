package programmingpractice.src.practice2023.binaryTree;





public class LinkedListInBTLeetCode {


    public boolean isSubPath(ListNode head, TreeNode root) {

        if(head == null){
            return  true; }
        if (root == null){
            return false;
        }
        if(head.val == root.val){
            if (isSamePath(head , root)){
                return  true;
            }
        }
        if (isSubPath(head , root.left)){
            return  true;
        }

        if (isSubPath(head , root.right)){
            return  true;
        }

        return  false;
    }

    private boolean isSamePath(ListNode head, TreeNode root) {
        if(head == null){
            return  true; }
        if (root == null){
            return false;
        }
        if(head.val == root.val){
            if (isSamePath(head.next , root.left)){
                return  true;
            }
            if (isSamePath(head.next , root.right)){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        LinkedListInBTLeetCode lbt = new LinkedListInBTLeetCode();
    }
}

class  ListNode{
int val;
ListNode next;
ListNode(int val , ListNode next){
   this.val = val;
   this.next = null;
}

}
