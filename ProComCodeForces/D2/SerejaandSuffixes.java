import java.util.*;



public class SerejaandSuffixes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] l = new int[n];

		for(int i = 0 ; i<a.length; i++){
			a[i] = sc.nextInt();
		}

		Set<Integer> set = new HashSet<>();
		int counter = 0;
		for(int i = a.length-1; i>=0; i--) {
			if(!set.contains(a[i])) {
				set.add(a[i]);
				counter ++;
			}
			l[i] = counter;
		}

		int x =0;
		while(sc.hasNextInt()){
			x = sc.nextInt();
			System.out.println(l[x-1]);
		}
	}
}
















