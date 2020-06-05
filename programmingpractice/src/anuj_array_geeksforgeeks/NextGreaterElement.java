package anuj_array_geeksforgeeks;

import java.util.Stack;

public class NextGreaterElement {

	public static void nextGreaterElement(int []array,int arrlength) {
		Stack<Integer> stack=new Stack<>();
		int []array1=new int[arrlength];
		
		for (int i = arrlength-1; i >=0; i--) {
			
			while(!stack.isEmpty() && stack.peek()<=array[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				array1[i]=-1;
			}
			else {
				array1[i]=stack.peek();
			}
			
			stack.push(array[i]);
		}
		
		
		for (int i = 0; i < arrlength; i++) {
			System.out.println(array[i]+"--------------"+array1[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int []array= {11, 13, 21, 3};
	     int arrlength=array.length;
	     nextGreaterElement(array,arrlength);
	     
	     
	}
}
