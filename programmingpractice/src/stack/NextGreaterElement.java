package stack;

import java.util.Stack;

public class NextGreaterElement {
      
	final int MAX=100;
	int []array=new int[MAX];
	int top=-1;

	void push(int data) {
		if(top>=MAX-1) {
			System.out.println("stack is full");
		}else {
			array[++top]=data;
		}
	}
	
	int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			int element=array[top];
			top--;
			return element;
		}
		return 0;
	}
	
	int peek() {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			int element=array[top];
			return element;
	}
		return 0;}
	
  boolean isEmpty() {
	  if(top==-1) {
		  return true;
	  }else {
		  return false;	  
	  }
 }
  
   static void printNextGreater(int []arr, int n){
	   NextGreaterElement stack=new NextGreaterElement();
	   int next=0;
	   int element=0;
	   
	   stack.push(arr[0]);
	   for (int i = 0; i < arr.length; i++) {
		   next=arr[i];
		if(stack.isEmpty()==false) {
			element=stack.pop();
			while(element<next) {
				System.out.println(element+"------"+next);
		     if (stack.isEmpty()) {
				break;
			}
		     element=stack.pop();
			}
			if(element>next) {
				stack.push(element);
			}
			stack.push(next);
		}   
	}
	   
	   while(!stack.isEmpty()) {
		   element=stack.pop();
		   next=-1;
		   System.out.println(element+"------------"+next); 
	   }
  }
  
	
	public static void main(String[] args) {
		 int arr[] = { 11, 13, 21, 3 };
	        int n = arr.length; 
	        printNextGreater(arr, n);
	}
	
	
}
