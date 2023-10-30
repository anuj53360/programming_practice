package programmingpractice.src.practice2023.linkedList;

public class LinkedListCycleLeetCode {

    public boolean hasCycle(ListNode head) {

        if (head == null){
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;

            if (fastPointer == slowPointer){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {

    }
}
