import java.util.*;
public class textSplit{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long slength = sc.nextInt();
		long x1 = sc.nextLong();
		long x2 = sc.nextLong();
		String str = sc.next();
		long cx1 = 0;
		long cx2 = 0;
		ArrayList<String> result = new ArrayList<>();
		long residuo = 0;

		for(int i = 0; i<(slength/x1)+1; i++) {
			residuo = slength-x1*i;

			if(residuo > -1 && residuo%x2 == 0) {
				cx1 = i;
				cx2 = residuo/x2;
				break;
			} else {
				residuo = slength-x2*i;
				if(residuo > -1 && residuo%x1 == 0) {
					cx2 = i;
					cx1 = residuo/x1;
					break;
				}
			}
		}
		

		if(cx1 == 0 && cx2 == 0) {
			System.out.println(-1);
		} else {
			for(long i = 0; i<cx1; i++) {
				result.add(str.substring((int)(i*x1),(int)(i*x1+x1)));
				//result[i+(cx3*2)] = str.subString(x3*cx3+i*x1,x3*cx3+i*x1+x1+1);
			}
			for(long i = 0; i<cx2; i++) {
				result.add(str.substring((int)(x1*cx1+i*x2),(int)(x1*cx1+i*x2+x2)));
				//result[i+(cx3*2)] = str.subString(x3*cx3+x1*cx1+i*x2,x3*cx3+x1*cx1+i*x2+x2+1);
			}
			System.out.println(result.size());

			for(int i = 0; i<result.size(); i++) {
				System.out.println(result.get(i));
			}
		}


	}


}