package p003;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double firstnumber;
		Double secondnumber;
		String operator;
		
		while(true){
			System.out.print("Enter first number: ");
			firstnumber = scanner.nextDouble();
			System.out.println();
			System.out.println("Enter second number: ");
			secondnumber = scanner.nextDouble();
			System.out.println();
			System.out.print("Enter operator: ");
			operator = scanner.next();
			System.out.println();
			Util.calculate(operator, firstnumber, secondnumber);
		}
	}

}
