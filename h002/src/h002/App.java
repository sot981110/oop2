package h002;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;
		System.out.println("a*x*x + b*x + c = ?");
		while(true){
			System.out.print("Enter a: ");
			a = scanner.nextDouble();
			System.out.println();
			System.out.print("Enter b: ");
			b = scanner.nextDouble();
			System.out.println();
			System.out.print("Enter c: ");
			c = scanner.nextDouble();
			System.out.println();
			Util.calc2ndDegEq(a, b, c);
		}

	}

}
