package linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import linkedlist.CloneLinkedList.Node;

public class CloneLinkedListWithMap {

	Node head;
public CloneLinkedListWithMap(Node head) {
        this.head=head;
}
	 


@Override
public String toString() {
	return "CloneLinkedListWithMap [head=" + head + "]";
}



public CloneLinkedListWithMap() {
	// TODO Auto-generated constructor stub
}



class Node{
		int data;
		Node next;
		Node random;
		Node(int data){
			this.data=data;
			Node next=null;
			Node random=null;
		}
	}
	
	public  void printList() {
		Node temp=this.head;
		while(temp!=null) {
			Node random = temp.random; 
			  int randomData = (random != null)? random.data: -1;
			System.out.println("original"+" "+temp.data+" "+"random"+" "+randomData);
		temp=temp.next;
		}
	}
	
	
	
	 public void push(int data) 
	    { 
	        Node node = new Node(data); 
	        node.next = this.head; 
	        this.head = node; 
	    }
	
//	public static Node clonedList(Node head) {
//		Node newNodehead=null;
//		Node temp=head;
//		java.util.Map<Integer, Integer> map=new HashMap<>();
//		while(temp!=null) {
//			Node newNode=new Node(temp.data);
//           newNode.next=newNodehead;
//          newNodehead=newNode;
//           if(temp.random!=null) {
//        	   map.put(temp.data, temp.random.data);
//           }
//			temp=temp.next;
//		}
//		Node temp1=newNodehead;
//		while(newNodehead!=null) {
//			int value=0;
//			
//			if(map.containsKey(newNodehead.data)) {
//			 value=map.get(newNodehead.data);
//			}
//			newNodehead.random=(newNodehead.data==value)
//			newNodehead=newNodehead.next;
//		}
//		
//		for (Entry<Integer, Integer> iterable_element : map.entrySet()) {
//			System.out.println(iterable_element.getKey()+" "+iterable_element.getValue());
//		}
//
//		
//		
//		
//		
//		
//		return newNodehead;
//	}
	
	
	public  CloneLinkedListWithMap clonedList() {
                Node orginal=this.head;
                Node clonelist=null;
                
                Map<Node, Node> map=new HashMap<>();
                while(orginal!=null) {
                	clonelist=new Node(orginal.data);
                	System.out.println(orginal.toString()+" "+clonelist.toString());
                	map.put(orginal, clonelist);
                	orginal=orginal.next;
                }
                
          orginal=this.head;
          
          while (orginal!=null) {
			
        	  clonelist=map.get(orginal);
        	  
        	  clonelist.next=map.get(orginal.next);
        	  System.out.println(" ");
        	  System.out.println(clonelist.next+" "+orginal.next);
        	  clonelist.random=map.get(orginal.random);
			orginal=orginal.next;
		}
          
                
                
                
		
		return new CloneLinkedListWithMap(map.get(this.head));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		Node start = new Node(1);  
//	    start.next = new Node(2);  
//	    start.next.next = new Node(3);  
//	    start.next.next.next = new Node(4);  
//	    start.next.next.next.next = new Node(5);  
//	  
//	     
//	    start.random = start.next.next;  
//	  
//	    // 2's random points to 1  
//	    start.next.random = start;  
//	  
//	    // 3's and 4's random points to 5  
//	    start.next.next.random = start.next.next.next.next;  
//	    start.next.next.next.random = start.next.next.next.next;  
//	  
//	    // 5's random points to 2  
//	    start.next.next.next.next.random = start.next;  
//	  
//	    System.out.println("Original list : ");  
//	    printList(start);  
//	  
//	    System.out.println("Cloned list : ");  
//	    CloneLinkedListWithMap cloned_list = clonedList(start);  
	 //   printList(cloned_list);

	
		
		CloneLinkedListWithMap list = new CloneLinkedListWithMap(); 
		list.push(5); 
		list.push(4); 
        list.push(3); 
        list.push(2); 
        list.push(1); 
  
        // Setting up random references. 
        list.head.random = list.head.next.next; 
        list.head.next.random = 
            list.head.next.next.next; 
        list.head.next.next.random = 
            list.head.next.next.next.next; 
        list.head.next.next.next.random = 
            list.head.next.next.next.next.next; 
        list.head.next.next.next.next.random = 
            list.head.next; 
  
        // Making a clone of the original linked list. 
        CloneLinkedListWithMap clone = list.clonedList(); 
  
        // Print the original and cloned linked list. 
        System.out.println("Original linked list"); 
        list.printList(); 
        System.out.println("\nCloned linked list"); 
        clone.printList(); 
	
	
	}
	
	
	
	
	
}
