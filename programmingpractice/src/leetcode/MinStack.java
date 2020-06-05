package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
	final int MAX=100;       
//	int []array=new int[MAX];
//	int []min=new int[MAX];
	List<Integer> array=new ArrayList<>();
	List<Integer> min=new ArrayList<>();
	int arraytop=-1;
	int mintop=-1;
	
	void push(int data) {
		//System.out.println(data);
		   if(arraytop>=MAX-1 || mintop> MAX-1) {
			   System.out.println("stack is full");
		   }
		   if(arraytop==-1 && mintop==-1 ) {
			   
           min.add(++mintop, data);  
           array.add(++arraytop, data); 
          //System.out.println(array[arraytop]+" "+min[mintop]);
		   }
		   else {
			   int element=minpeak();
			 //  System.out.println(element);
			   if(data>element) {
				   min.add(++mintop, element); 
			   }else {
				   min.add(++mintop, data); 
			   }
			   array.add(++arraytop, data);
		   }
		   
//		   for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
	}
	
	int arraypeak() {
		if(arraytop==-1 ) {
			System.out.println("stack is empty");
		}else {
			int element=array.get(arraytop);
			return element;
		}
		return 0;
	}

int minpeak() {
		if(mintop==-1) {
			System.out.println("stack is empty");
		}else {
			int element=min.get(mintop);
			return element;
		}
		return 0;
	}

boolean isEmpty() {
	if(arraytop ==-1 && mintop==-1) {
		return true;
	}else {
		return false;
	}
}


int arraypop() {
	if(arraytop==-1) {
		System.out.println("stack is Empty");
	}
	else {
		int element=array.get(arraytop);
         arraytop--;
         return element;
	}
	return 0;
}

int minpop() {
	if(mintop==-1) {
		System.out.println("stack is Empty");
	}
	else {
		int element=min.get(mintop);
         mintop--;
         return element;
	}
	return 0;
}
   
int getmin() {
	if(mintop==-1) {
		System.out.println("stack is empty");
	}else {
		int element=min.get(mintop);
		return element;
	}
	return 0;
}
    
    
    public static void main(String[] args) {
		MinStack minstack=new MinStack();
		
	}
	
}
