import java.util.*;
import java.lang.Math;

class Calcu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = 0;
		float num2 = 0;
		String operation = "";
		while(true) {
			System.out.print("Operando: ");
			num1 = Float.parseFloat(sc.nextLine());
			System.out.print("Operandor: ");
			operation = sc.nextLine();
			System.out.print("Operando: ");
			num2 = Float.parseFloat(sc.nextLine());

			switch (operation) {
				case "+":
					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, num1+num2);
					break;
				case "-":
					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, num1-num2);
					break;
				case "*":

					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, num1*num2);
					break;
				case "/":
					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, num1/num2);
					break;
				case "**":
					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, Math.pow(num1, num2));
					break;
				case "^":
					System.out.printf("%.2f %s %.2f = %.2f \n", num1, operation, num2, Math.pow(num1, num2));
					break;
			}
		}
	}
}