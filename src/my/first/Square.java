package my.first;

public class Square {
	
	private double a;
	
	//constructor
	Square(double a){
		this.a = a;
	}
	
	//a setter
	public void set_a(double a){
		this.a=a;
	}
	
	//a getter
	public double get_a(){
		return this.a;
	}
	
	//Area Calculator
	public double cal_T(){
		return Math.pow(this.a, 2);
	}
	
	//Periphery Calculator
	public double cal_K(){
		return 4*this.a;
	}
	
}
