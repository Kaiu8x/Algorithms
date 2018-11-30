import java.util.*;
public class nudistBeach {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] fortress = new int[k];
		int[][] edges = new int[m][2];

		for(int i = 0; i<fortress.length; i++) {
			fortress[i] = sc.nextInt();
		}

		for(int i = 0; i<edges.length; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
		}

		

		
	}
}