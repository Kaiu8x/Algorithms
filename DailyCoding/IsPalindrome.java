import java.util.*;
class IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese palabra (sin acentos y en minúsculas): ");
		String str = sc.nextLine();
		
		Boolean result = isPalindrome(str);

		if (result)
			System.out.println("Es palíndromo");
		else
			System.out.println("No es palíndromo");

	}

	public static boolean isPalindrome(String str) {
		StringBuilder strbld = new StringBuilder();
		strbld.append(str);
		Boolean result = true;

		strbld = strbld.reverse();

		String reverse = strbld.toString();

		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)){
				result = false;
				break;
			}
		}

		return result;	
	}
}