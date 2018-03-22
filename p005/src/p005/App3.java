package p005;

import java.util.Random;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		double aSide,bSide;
		Random rnd = new Random();
		Rectangle[] rectangles = new Rectangle[10];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(rnd.nextInt(8)+2, rnd.nextInt(8)+2);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("A side: ");
		aSide = scanner.nextDouble();
		System.out.println("B side: ");
		bSide = scanner.nextDouble();
		Rectangle readRectangle = new Rectangle(aSide, bSide);
		

	}

}
