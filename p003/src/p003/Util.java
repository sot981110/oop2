package p003;

public class Util {
	
	public static void calculate(String operator, Double firstnumber, Double secondnumber){
		
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
				System.out.println("Can't divide by 0.");
			}
			else{
				System.out.println(firstnumber / secondnumber);
			}
			break;
		
		case "*":
			System.out.println(firstnumber * secondnumber);
			break;
		
		default:
			System.out.println("Not included calculation");
			break;
		}
		
		return;
	}
	
}
