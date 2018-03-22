package p005;

public class Rectangle {
	
	private double a, b;
	
	//Constructors
	public Rectangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	//Getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	//Setters
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	//Methods
	public double getArea(){
		return this.a*this.b;
	}
	
	public double getBorder(){
		return 2*this.a+2*this.b;
	}
	
	public void setBoth(double a, double b){
		this.setA(a);
		this.setB(b);
	}
	
	public String toString(){
		return this.a + "" + this.b;
	}
	
}
