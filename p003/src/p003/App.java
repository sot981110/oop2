package p003;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstnumber;
		Double secondnumber;
		String operator;
		while (true) {
			calculation = scanner.nextLine();
			if (calculation.contains("exit")) {
				System.out.println("Calculator stopped.");
				break;
			}
			firstnumber = Double.parseDouble(calculation.split(" ")[0]);
			secondnumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			Util.calculate(operator, firstnumber, secondnumber);

		}
		scanner.close();
		return;
	}

}
