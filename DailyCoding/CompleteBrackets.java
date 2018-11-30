import java.util.*;
import java.lang.*;
public class CompleteBrackets {

	public static void main(String[] args) {
		String s = "))()(())))(()(()((())";
		//res = "(((( ))()(())))(()(()((()) )))"

		System.out.println(completeBalance(s));
		
	}

	public static String completeBalance(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		char c;

		for(int i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			//System.out.println(c);
			if(c == '{' || c =='(' || c == '[') {
				stack.push(c);
			}

			if(c == ')'){
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					if(stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(c);
					}
				}
			}

			if(c == '}'){
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					if(stack.peek() == '{') {
						stack.pop();
					} else {
						stack.push(c);
					}
				}
			}

			if(c == ']'){
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					if(stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(c);
					}
				}
			}
		}

		boolean flag = true;
		if(stack.isEmpty()){
			return s;
		} else {
			StringBuilder strbl = new StringBuilder();
			for(int i = stack.size()-1; i>0; i--) {
				//System.out.println(stack.get(i));
				if(stack.get(i) == ')'){
					strbl.append('(');
				}
				if(stack.get(i) == '(' && flag) {
					strbl.append(' ');
					strbl.append(s);
					strbl.append(' ');
					strbl.append(')');
					flag = false;
				}
				if(stack.get(i) == '('){
					strbl.append(')');
				}
			}
			return strbl.toString();
		}
	}


}