package stack;

import java.util.Stack;

public class MaxRectangleInHistogram {

	public static int maxRectangleInHistogram(int []array,int n) {
       
		Stack<Integer> stack=new Stack<>();
		int top=0;
        int max_area=0;
        int max_with_top=0;
       int i=0;
       
       while(i<n) {
    	   
    	   if(stack.isEmpty() || array[stack.peek()]<=array[i]) {
    		   stack.push(i++);
    	   }else {
    		   top=stack.peek();
    		   stack.pop();
    		   max_with_top=array[top]*(stack.isEmpty()?i:i-stack.peek()-1);
    		   
    		   if(max_area<max_with_top) {
    			   max_area=max_with_top;
    		   }
    	   }
       }
        
     while(stack.isEmpty()==false) {
    	 top=stack.peek();
		   stack.pop();
		   max_with_top=array[top]*(stack.isEmpty()?i:i-stack.peek()-1);
		   
		   if(max_area<max_with_top) {
			   max_area=max_with_top;
		   }
     }        
		
		
		return max_area;
	}
	
	public static void main(String[] args) {
	int array[]= {6,2,5,4,5,1,6};
	int n=array.length;
	int max_area=maxRectangleInHistogram(array,n);
	System.out.println(max_area);
	}
}
