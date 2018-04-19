package exception;

public class DivisionByZeroException extends Exception{
	public DivisionByZeroException(String message){
		super(message);
	}
	
	public DivisionByZeroException(){
		super("you can't divide by 0");
	}
}
