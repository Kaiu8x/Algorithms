import java.util.*;
public class BalancedBrackets {

	public static void main(String[] args) {
		String s = "{{[][]((){}[])}()}";
		System.out.println(checkBalance(s));
		
	}

	public static String checkBalance(String s) {
		Stack<Character> stack = new Stack<>();
		char c = s.charAt(0);
		
		for(int i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			//System.out.println(c);
			if(c == '{' || c =='(' || c == '[') {
				stack.push(c);
			}

			if(c == '}'){
				if(stack.empty()) {
					return "NotBalanced";
				} else {
					if(stack.peek() == '{') {
						stack.pop();
					} else {
						return "NotBalanced";
					}
				}
			}

			if(c == ']'){
				if(stack.empty()) {
					return "NotBalanced";
				} else {
					if(stack.peek() == '[') {
						stack.pop();
					} else {
						return "NotBalanced";
					}
				}
			}

			if(c == ')'){
				if(stack.empty()) {
					return "NotBalanced";
				} else {
					if(stack.peek() == '(') {
						stack.pop();
					} else {
						return "NotBalanced";
					}
				}
			}



		}
		if(stack.empty()){
			return "Balanced";
		} else {
			return "NotBalanced";
		}
	}
	



}