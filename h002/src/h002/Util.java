package h002;

public class Util {

	public static void calc2ndDegEq(double a, double b, double c){
		
		System.out.print("Result: ");
		
		if(a == 0){
			System.out.println("1 Result: x1 = " + ((-c)/b));
		}
		else{
			if(((Math.pow(b, 2))-(4*a*c)) < 0){
				System.out.println("No Real root.");
			}
			else if(((Math.pow(b, 2))-(4*a*c)) == 0){
				System.out.println("1 Result: x1 = " + ((-b)/(2*a)));
			}
			else{
				System.out.println("2. Results: x1 = " + (((-b)+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a)) + " x2 = " + (((-b)-(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a)));
			}
		}
		
	}
	
}
