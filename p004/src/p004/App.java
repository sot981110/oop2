package p004;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args){
		double[] array = new double[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the " + i +". number: ");
			array[i] = scanner.nextDouble();
			System.out.println();
		}
		double avr = 1;
		for (int i = 0; i < array.length; i++) {
			avr *= array[i];
		}
		avr /= array.length;
		System.out.println("Result: " + avr);
		scanner.close();
	}
}
