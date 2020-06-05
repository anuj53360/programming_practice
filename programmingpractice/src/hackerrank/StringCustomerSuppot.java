package hackerrank;

import java.util.Stack;

public class StringCustomerSuppot {

	static String[] braces(String[] values) {
	     String []string=new String[values.length];
	     for (int i = 0; i < string.length; i++) {
			String s=values[i];
             boolean x=areParenthesisBalanced(s);
	          if(x) {
	        	  string[i]="YES";
	          }else {
	        	  string[i]="NO";
	          }
	     }  
	       return string;  
		    }
	
	
	 static boolean areParenthesisBalanced(String s) 
	    { 
		 
		char exp[]=s.toCharArray(); 
	    
	       Stack<Character> stack= new Stack(); 
	       for(int i=0;i<exp.length;i++) 
	       { 
	          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
	            stack.push(exp[i]); 
	          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
	          { 
	             if (stack.isEmpty()) 
	               { 
	                   return false; 
	               }  
	             else if ( !isMatchingPair(stack.pop(), exp[i]) ) 
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	       if (stack.isEmpty()) {
	         return true; }
	       else {
			return false;
		}
	           
	    }
	       static boolean isMatchingPair(char character1, char character2) 
	       { 
	          if (character1 == '(' && character2 == ')') 
	            return true; 
	          else if (character1 == '{' && character2 == '}') 
	            return true; 
	          else if (character1 == '[' && character2 == ']') 
	            return true; 
	          else
	            return false; 
	       }
	    
	
	public static void main(String[] args) {
		String []values= {"[{}]","[{]}"};
		String [] string=braces(values);
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);	
		}
		
	}
}
