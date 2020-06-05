package stack;

public class ParathesisChecker {
	    final int MAX=100;
	char []charcter=new char[MAX];
	 int top=-1;
	
	void push(char c) {
		if(top>= MAX-1) {
			System.out.println("stack is oerflow");
		}else {
			charcter[++top]=c;
		}
	}
	
	Character pop() {
		if(top==-1) {
			System.out.println("No data in stack");
		}else {
			char c=charcter[top];
			top--;
			return c;
		}
		return null;
	} 

	boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	Character peek() {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			Character c=charcter[top];
		return c;
		}
		return null;
	}
	
	
	
public boolean paranthesisChecker(char exp[]) {
   ParathesisChecker stack=new ParathesisChecker();
	for (int i = 0; i < exp.length; i++) {
		if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[') {
		stack.push(exp[i]);
	}
		System.out.println(stack.peek());	
		if(exp[i]=='}' || exp[i]==')' || exp[i]==']') {
			
			if(stack.isEmpty()) {
				System.out.println("false");
				return false;
			}
			else if(!isMatching(stack.pop(),exp[i])){
				return false;
			}}
		}
	if(stack.isEmpty()) {
		System.out.println("true");
		return true;
	}else {
		System.out.println("false");
		return false;
	}
	
	}
	
	boolean isMatching(Character c1,Character c2) {
		System.out.println(c1+" "+c2);
         if(c1=='(' && c2==')') {
        	 return true;
         }else if(c1=='{' && c2=='}') {
        	 return true;
         }
         else if(c1==']' && c2==']') {
        	 return true;
         }else {
         return false;
         }
	}
	
	
	 public static void main(String[] args) {
		char exp[] = {'{','(',')','}','[',']'};
		ParathesisChecker pc=new ParathesisChecker();
		if(pc.paranthesisChecker(exp)) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
	}
	
	
	
	
}
