package binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;



public class BottomViewBT {

	class Node{
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
	
	
	public void bottotmViewBinaryTree() {
		
		if(root==null) {
			return;
		}
		int hd=0;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		Queue<Node> queue=new LinkedList<>();
		
		queue.add(root);
		root.hd=hd;
		while(!queue.isEmpty()) {
			
			Node temp=queue.remove();
			
			hd=temp.hd;
			map.put(hd, temp.data);
			
			if(temp.left!=null) {
				temp.left.hd=hd-1;
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				temp.right.hd=hd+1;
				queue.add(temp.right);
			}
		}

		for (Entry<Integer, Integer> iterator : map.entrySet()) {
			System.out.println(iterator.getValue());
		}
		
		
	}
	
   
	
	public static void main(String[] args) {
		BottomViewBT bvbt=new BottomViewBT();
	    bvbt.root=bvbt.new Node(20);
	    bvbt.root.left=bvbt.new Node(8);
	    bvbt.root.right=bvbt.new Node(22);
	    bvbt.root.left.left=bvbt.new Node(5);
	    bvbt.root.left.right=bvbt.new Node(3);
	    bvbt.root.right.right=bvbt.new Node(25);
	    bvbt.root.left.right.left=bvbt.new Node(10);
	    bvbt.root.left.right.right=bvbt.new Node(14);
	    bvbt.bottotmViewBinaryTree();
	}
}
