import java.util.*;

public class WeirdSubstractionProcess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();

		boolean flag = true;

		while( (a != 0 && b != 0) && flag) {
			if(a >= b*2) {
				a = a%(b*2);
			} else {
				if(b>= a*2) {
					b = b%(a*2);
				} else {
					flag = false;
				}
			}
		}

		System.out.println(a+" "+b);

	}
}