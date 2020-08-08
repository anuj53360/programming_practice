package binarytree;

public class ShortestDistanceBwTwoNodes {

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}

	Node root;

	public int distancebwtwoNode(Node root, int a, int b) {
		int temp = 0;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		distancebwtwoNodes(root, a, b);
		return b;
	}

	private int distancebwtwoNodes(Node root, int a, int b) {
      if(root==null) {
    	  return 0;
      }

      if(root.val>a && root.val>b) {
    	  return distancebwtwoNodes(root.left, a, b);
      }
      
      if(root.val <a && root.val <b) {
    	  return distancebwtwoNodes(root.right, a, b);
      } 
      
      if(root.val>=a && root.val <= b) {
    	  return distancebwtwoNodeUtil(root, a) + distancebwtwoNodeUtil(root,b);
      }
      
      return b;

	}

	private int distancebwtwoNodeUtil(Node root2, int a) {
           if(root == null)
        	   return 0;
           
           if(root.val>a) {
        	return  1+distancebwtwoNodeUtil(root2.left, a);
           }

		return 1+distancebwtwoNodeUtil(root2.right, a);
	}

	public static void main(String[] args) {

		ShortestDistanceBwTwoNodes shn = new ShortestDistanceBwTwoNodes();
		shn.root = shn.new Node(5);
		shn.root.left = shn.new Node(2);
		shn.root.right = shn.new Node(12);
		shn.root.left.left = shn.new Node(1);
		shn.root.left.right = shn.new Node(3);
		shn.root.right.left = shn.new Node(9);
		shn.root.right.right = shn.new Node(21);
		shn.root.right.right.left = shn.new Node(19);
		shn.root.right.right.left = shn.new Node(25);

		shn.distancebwtwoNode(shn.root, 3, 9);
	}
}
