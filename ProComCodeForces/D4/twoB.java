import java.util.*;
public class twoB {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 0;

		int temp = m;
		if (n>m) {
			c += n-m;
		}else{
			while( n!=m ){
				if (n>m) {
					n--;
					c++;
				}else if(n<m){
					if ((m%2) == 0) {
						m = m/2;
						c++;
					}else{
						m++;
						c++;
					}
				}
			}
		}
		System.out.println(""+c);


		/*while(n<m){
			

			if ((m/2)>2*n) {
				d++;
				m = m/2;
				//System.out.println(m);
			}

			if (2*n>=m) {
				
				if (2*(n-1)>=m) {
					n = n-1;
					c++;
				}else{
					n = 2*n;
					c++;
				}

			}
			else if (2*n <= m){
				n = 2*n;
				c++;
			}
			if(d>0 && n>m){
				c += n-m;
				n = (int)m;
				
			}
				//System.out.println("  c "+c+"   n "+n);
			if (d>0 && n < m+1 && n>m-1) {
				flag = false;
				m = 2*m;
				d--;
			}
			else{
				if (m/n>=2) {
					flag = true;
				}
				if (m/n<2 && !flag) {
					c = c+1;
					n = n-1;

					System.out.println("c "+c+"   n "+n);
				}else{
					n = n*2;
					c = c+1;
					System.out.println("2c "+c+"   n "+n);
				}
			}
			
			
		}*/
		
	}
}