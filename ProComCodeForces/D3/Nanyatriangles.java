
import java.util.*;
public class Nanyatriangles {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];

		int count = 0;

		for (int i = 0;i<n ;i++ ) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		if(n > 2){
			double x0 = 0;
			double y0 = 0;
			double x1 = 0;
			double y1 = 0;
			double x2 = 0;
			double y2 = 0;

			for(int i = 0; i<x.length; i++) {
				x0 = x[i];
				y0 = y[i];
				for(int j = i+1; j<x.length; j++) {
					x1 = x[j];
					y1 = y[j];
					for(int k = j+1; k<x.length; k++) {
						x2 = x[k];
						y2 = y[k];
						if(((y1-y0)*(x2-x0)) != ((y2-y0)*(x1-x0))) {
							count++;
						}
					}
				}
			}

			System.out.println(count);

		} else {
			System.out.println(0);
		}

		
		
	}
}