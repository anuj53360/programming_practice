package linkedlist;

import java.util.HashMap;

public class LRUCacheImpl {

	class Node{
		int key;
		int value;
		Node prev;
		Node next;
		 public Node(int key,int value){
			this.key=key;
			this.value=value;
			this.next=null;
			this.prev=null;
		}
		 public Node() {}
	}
	HashMap<Integer, Node> hasMap;
	Node start;
	Node end;
	int cache_size=5;
	LRUCacheImpl(){
		hasMap=new HashMap<>();
	}

	public int getEntry(int key) {
		if(hasMap.containsKey(key)) {
			Node node= hasMap.get(key);
			removeNode(node);
			addtoTop(node);
			return node.value;
		}
		return -1;
	}
	
	public void removeNode(Node node) {
		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			start = node.next;
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		} else {
			end = node.prev;
		}
	}
	
	public void addtoTop(Node node) {
		node.next = start;
		node.prev = null;
		if (start != null)
			start.prev = node;
		start = node;
		if (end == null)
			end = start;
	}
	
	public void putEntry(int key, int value) {
		if (hasMap.containsKey(key))
		{
			Node node = hasMap.get(key);
			node.value = value;
			removeNode(node);
			addtoTop(node);
		} else {
			Node newnode = new Node();
			newnode.prev = null;
			newnode.next = null;
			newnode.value = value;
			newnode.key = key;
			if (hasMap.size() > cache_size)
			{
				System.out.println(hasMap.get(key)+"aaaa");
				hasMap.remove(end.key);
				removeNode(end);				
				addtoTop(newnode);
			} else {
				addtoTop(newnode);
			}
			hasMap.put(key, newnode);
		}
	}
	
	
	public static void main(String[] args) {
		LRUCacheImpl lrucacheimpl = new LRUCacheImpl();
		lrucacheimpl.putEntry(1, 1);
		lrucacheimpl.putEntry(10, 15);
		lrucacheimpl.putEntry(15, 10);
		lrucacheimpl.putEntry(10, 16);
		lrucacheimpl.putEntry(12, 15);
		lrucacheimpl.putEntry(18, 10);
		lrucacheimpl.putEntry(13, 16);

		System.out.println(lrucacheimpl.getEntry(1));
		System.out.println(lrucacheimpl.getEntry(10));
		System.out.println(lrucacheimpl.getEntry(15));
	}
}
