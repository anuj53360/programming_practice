package programmingpractice.src.practice2023.linkedList;

public class SwapNodesValueLinkedList {

    public ListNode swapNodes(ListNode head, int k) {

        ListNode startNode = head;
        ListNode endNode = head;

        ListNode first = head;
        ListNode second = head;


        for (int i=0;i<k-1;++i){
            startNode = startNode.next;
        }
        first = startNode;

        while (startNode.next !=null){
            endNode = endNode.next;
            startNode = startNode.next;
        }
        second  = endNode;

        int temp = second.value;
        second.value =first.value;
        first.value = temp;

        return head;
    }

    public static void main(String[] args) {

    }
}
