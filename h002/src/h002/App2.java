package h002;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;
		String input;
		System.out.println("a*x*x + b*x + c = ?");
		while(true){
			System.out.println("Enter the numbers (a,b,c): ");
			input = scanner.nextLine();
			if(input.contains("exit")){
				break;
			}
			a = Double.parseDouble(input.split(",")[0]);
			b = Double.parseDouble(input.split(",")[1]);
			c = Double.parseDouble(input.split(",")[2]);
			Util.calc2ndDegEq(a, b, c);
		}
		scanner.close();
		return;

	}

}
