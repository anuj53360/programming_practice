//package programmingpractice.src.binarytree;
//
//class Index {
//	int index = 0;
//}
//
//public class ConstructBSTFromPreorder {
//
//	class Node {
//		int val;
//		Node left;
//		Node right;
//
//		Node(int val) {
//			this.val = val;
//			left = null;
//			right = null;
//		}
//	}
//
//	Node root;
//	Index index = new Index();
//
//	Node bstFromPreorder(int[] array, int n) {
//		Index preindex = 0;
//		return bstFromPreOrderConstruct(array, preindex, array[0], Integer.MIN_VALUE, Integer.MAX_VALUE, n);
//
//	}
//
//	private Node bstFromPreOrderConstruct(int[] array, Index preindex, int key, int minValue, int maxValue, int n) {
//
//		if (preindex.index > n)
//			return null;
//
//		if (key > minValue && key < maxValue) {
//			root = new Node(key);
//			preindex.index = preindex.index + 1;
//
//			if (preindex.index < n) {
//				root.left = bstFromPreOrderConstruct(array, preindex, array[preindex.index], minValue, key, n);
//				root.right = bstFromPreOrderConstruct(array, preindex, array[preindex.index], key, maxValue, n);
//			}
//		}
//
//		return root;
//
//	}
//
//	public static void main(String[] args) {
//
//		int[] array = { 10, 5, 1, 7, 40, 50 };
//		int n = array.length;
//		ConstructBSTFromPreorder bstfpreorder = new ConstructBSTFromPreorder();
//		bstfpreorder.bstFromPreorder(array, n);
//	}
//}
