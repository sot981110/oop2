package p003;

import exception.DivisionByZeroException;

public class Util {
	
	public static void calculate(String operator, Double firstnumber, Double secondnumber) throws DivisionByZeroException,IllegalArgumentException{
		
		System.out.print("Result: ");
		
		switch (operator) {
		case "+":
			System.out.println(firstnumber + secondnumber);
			break;
			
		case "-":
			System.out.println(firstnumber - secondnumber);
			break;
		
		case "/":
			if(secondnumber == 0){
				throw new DivisionByZeroException();
			}
			else{
				System.out.println(firstnumber / secondnumber);
			}
			break;
		
		case "*":
			System.out.println(firstnumber * secondnumber);
			break;
		
		default:
			throw new IllegalArgumentException();
		}
		
		return;
	}
	
}
