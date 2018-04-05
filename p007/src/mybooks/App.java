package mybooks;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println("How many books to read in: ");
		n = scanner.nextInt();
		
		BookStyle[] books = new BookStyle[n];
		
		//TODO
		
		scanner.close();
	}

}
