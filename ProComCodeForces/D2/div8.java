import java.util.*;
public class div8{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int n = in.length();
		String sol = "0";
		boolean ans = false;
		char[]ch = in.toCharArray();
				
		for (int i = 0;i<n ;i++ ) {
			if (Integer.parseInt(""+ch[i])%8 == 0) {
				ans = true;
				sol = ""+ch[i];
				break;
			}
			if (n>1) {
				for (int j = i+1;j<n ;j++ ) {
					if (Integer.parseInt((""+ch[i]+ch[j]))%8==0) {
						ans = true;
						sol = ""+ch[i]+ch[j];
						break;
					}
					if (n>2) {
						for (int k = j+1;k<n ;k++ ) {
							if (Integer.parseInt((""+ch[i]+ch[j]+ch[k]))%8==0) {
								ans = true;
								sol = ""+ch[i]+ch[j]+ch[k];
								break;
							}
						}
					}
					
				}
			}
			
		}
		if (ans) {
			System.out.println("YES");
			System.out.println(sol);
		}else{
			System.out.println("NO");
		}
		

	}
}