package programmingpractice.src.practice2023.linkedList;

import java.util.List;

public class LinkedListTwoLeetCode {

    public ListNode detectCycle(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next !=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer){
                break;
            }
        }
        if (fastPointer == null && fastPointer.next == null){
            return null;
        }

        ListNode start = head;
        while (start != slowPointer){
            start = start.next;
            slowPointer= slowPointer.next;

        }
return start;
    }

    public static void main(String[] args) {

    }
}
