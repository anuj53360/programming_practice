package leetcode;

public class DeleteNodeLinkedList {

	class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			this.data=data;
			next=null;
		}
	}
	ListNode head;	
	
       public void push(int data) {
    	   ListNode newnode=new ListNode(data); 
      newnode.next=head;
      head=newnode;
       }
       
       public void printlist() {
    	   ListNode temp=head;
       while(temp!=null) {
    	   System.out.print(temp.data);
    	   temp=temp.next;
       }
       System.out.println(" ");
       }
       
       public void deleteNode(int node) {
           //if it is last node
    	  ListNode temp=head;
    	  ListNode prev=null;
    	   while(temp!=null) {
    		   if(temp.data==node) {
    			   prev.next=temp.next;
    		   }
    		   prev=temp;
    		   temp=temp.next;
    		  
    	   }
    	   
       }
       
	
	public static void main(String[] args) {
     DeleteNodeLinkedList dnll=new DeleteNodeLinkedList();
     dnll.push(4);
     dnll.push(5);
     dnll.push(1);
     dnll.push(9);
     dnll.printlist();
     dnll.deleteNode(5);
     dnll.printlist();
	}
}
