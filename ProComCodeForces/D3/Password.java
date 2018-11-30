import java.util.*;
public class Password{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		StringBuilder strb = new StringBuilder();

		List<Character> arr = new ArrayList<>();

		String maybe = "";
		int f1 = 0;

		for(int i = str.length()-1; i>str.length()/2; i--) {
			if(str.charAt(i) == str.charAt(0)) {
				maybe = str.substring(i,str.length());
				break;
			}
		}

		for(int i = 0; i<maybe.length(); i++) {
			if(str.charAt(i) != maybe.charAt(i)) {
				f1 = 1;
				break;
			}
		}

		if(f1 == 0) {
			String newstr = str.substring(maybe.length()-1,str.length()-maybe.length());
			CharSequence cs = maybe;
			if(newstr.contains(cs)){
				System.out.println(maybe);
			} else {
				System.out.println("Just a legend");
			}
		} else {
			System.out.println("Just a legend");
		}


	}
}






