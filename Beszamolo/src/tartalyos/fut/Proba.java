package tartalyos.fut;

import java.util.Scanner;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tartaly[] tartalyok = new Tartaly[5];
		int terfogat;
		double nyomas;
		
		
		for (int i = 0; i < tartalyok.length; i++){
			System.out.println("Adja meg a(z) " + (i+1) + ". tartály terfogatát: ");
			terfogat = Integer.parseInt(scanner.nextLine());
			System.out.println("Adja meg a(z) " + (i+1) + ". tartály nyomását: ");
			nyomas = Double.parseDouble(scanner.nextLine());
			tartalyok[i] = new Tartaly(terfogat, nyomas);
		} // 1
		
		for (int i = 0; i < tartalyok.length; i++) { // 1
			System.out.println(tartalyok[i].toString());
		}
		
		Tartaly nyomasmaxtartaly = tartalyok[1];
		for(int i = 1; i < tartalyok.length; i++){
			if(tartalyok[i].nagyobbNyomasuE(nyomasmaxtartaly)){
				nyomasmaxtartaly = tartalyok[i];
			}
		} // 1
		
		
		System.out.println("Legnagyobb nyomás: ");
		System.out.println(nyomasmaxtartaly.toString());
		
		Tartaly terfogatmaxtartaly = tartalyok[1];
		for(int i = 1; i < tartalyok.length; i++){
			if(tartalyok[i].getTerfogat() > terfogatmaxtartaly.getTerfogat()){
				terfogatmaxtartaly = tartalyok[i];
			}
		}
		System.out.println("Legangyobb térfogat: ");
		System.out.println(terfogatmaxtartaly.toString());
		
		scanner.close();
		return;

	}

}
