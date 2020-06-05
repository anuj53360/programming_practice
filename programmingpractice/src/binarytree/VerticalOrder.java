package binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import binarytree.BottomViewBT.Node;

public class VerticalOrder {
       
	
	class Node {
		int data;
		int hd;
		Node left,right;
 Node(int data){
	 this.data=data;
	 hd=Integer.MAX_VALUE;
	 left=null;
	 right=null;
 }
	}
	
	Node root;
	
	public void verticalOrder(Node root,int hd,Map<Integer, List<Integer>> map) {

		if(root==null) {
			return;
		}
	        List<Integer> l=map.get(hd);
	        if(l==null) {
	        	l = new ArrayList<>();
	        	l.add(root.data);
	        }else{
	        	l.add(root.data);
	        }
	        
	        map.put(hd, l);
	     verticalOrder(root.left, hd-1, map);
	     verticalOrder(root.right, hd+1, map);
	}
	
	public void verticalOrderUtil() {
	Map<Integer, List<Integer>> map=new HashMap<>();
	int hd=0;
		verticalOrder(root,hd,map);
		
		for (Entry<Integer,List<Integer>> iterable_element : map.entrySet()) {
			System.out.println(iterable_element.getValue());
		}
		
		
	}
	
	public static void main(String[] args) {
		VerticalOrder ver= new VerticalOrder();
		ver.root=ver.new Node(1);
		ver.root.left = ver.new Node(2); 
		ver.root.right =ver. new Node(3); 
        ver.root.left.left = ver.new Node(4); 
        ver. root.left.right = ver.new Node(5); 
        ver.root.right.left = ver.new Node(6); 
        ver. root.right.right = ver.new Node(7); 
        ver. root.right.left.right = ver.new Node(8); 
        ver. root.right.right.right = ver.new Node(9); 
		ver.verticalOrderUtil();
	
	}
}
