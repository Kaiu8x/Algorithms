public class sereja{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ni = new int[n];
		int[] mi = new int[m];
		int[] c = new int[n];
		Set<Integer> ans = new HashSet<Integer>();
		for (int i = 0;i<n ;i++ ) {
			ni[i] = sc.nextInt();
			
						
		}

		for (int i = 0;i<m ;i++ ) {
			mi[i] = sc.nextInt();
		}
		for (int i = n-1;i>=0 ; i--) {
			ans.add(ni[i]);
			c[i] = ans.size();

		}
			for (int i = 0;i<m ;i++ ) {
				
				System.out.println(c[mi[i]-1]);

			}
	}
}