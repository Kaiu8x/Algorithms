import java.util.*;
public class cthulu {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 0;
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(0);
		for (int i = 1;i<n+1 ;i++ ) {
			a.add(i);
		}
		for (int i = 0;i<m ;i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();
//			int temp1;
//			int temp2;
/*			if (x == a.get(x)) {
				temp1 = x;
			}else{
				a.set()
				temp1 = 
			}*/
			if (finder(x,a) == finder(y,a)) {
				c++;
			}
			a.set(finder(x,a),finder(y,a));
			//union(x,y,a);
		}
		if (c == 1 && n<=m) {
			System.out.println("FHTAGN!");
		}else{
			System.out.println("NO");
		}
	}	
		public static int finder(int x, ArrayList<Integer> find){
			if (x == find.get(x)) {
				return x;
			}else{
				find.set(x,finder(find.get(x), find));
				return find.get(x);
			}
			
		}
}