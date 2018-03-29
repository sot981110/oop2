package my.first;

public class Number {
	private static double delta = 0.001;
	private double num;
	
	//Constructors
	public Number(double num){
		this.num = num;
	}
	
	//Getters
	public static double getDelta() {
		return delta;
	}

	public double getNum() {
		return num;
	}

	//Setters
	public static void setDelta(double delta) {
		Number.delta = delta;
	}

	public void setNum(double num) {
		this.num = num;
	}  
	
	//Methods
	public boolean isBetweenDelta(double num2){
		return (Math.abs(this.num - num2) <= Number.delta);
	}
	
}
