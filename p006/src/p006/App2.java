package p006;

import java.util.Random;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		int averageYearsUntilRetirement;
		
		System.out.println("How many employees? ");
		int n = scanner.nextInt();
		
		Employee[] employees = new Employee[n];
		
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("employee " + (i+1), Math.abs(rnd.nextInt()%100000 +10000) , Math.abs(rnd.nextInt()%47 + 18));
			System.out.println(employees[i].toString());
		}
		
		Employee.setRetirementAge(60);
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}
		
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].yearsUntilRetirement() <= 5){
				System.out.println(employees[i].toString());
			}
		}
		
		averageYearsUntilRetirement = 0;
		for (int i = 0; i < employees.length; i++) {
			averageYearsUntilRetirement += employees[i].yearsUntilRetirement();
		}
		averageYearsUntilRetirement = averageYearsUntilRetirement/employees.length;
		
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].yearsUntilRetirement() >= averageYearsUntilRetirement){
				System.out.println(employees[i].toString());
			}
		}
		
		
		
		scanner.close();
	}

}
