package p005;

public class Rectangle {
	
	//Variables
	private Integer a;
	private Integer b;
	
	//Constructor
	public Rectangle(Integer a, Integer b){
		this.a = a;
		this.b = b;
	}
	
	//Methods
	public String toString(){
		return this.a + " " + this.b;
	}
	
	public void setBoth(Integer a){
		if(0 < a && 0 < b){
			this.a = a;
			this.b = a;
		}
	}
	
	public void setBoth(Integer a, Integer b){
		if(0 < a && 0 < b){
			this.a = a;
			this.b = b;
		}
	}
	
	public Integer getArea(){
		return this.a*this.b;
	}
	
	public Integer getBorder(){
		return (2*this.a)+(2*this.b);
	}
	
	public boolean isBiggerThan(Rectangle a){
		if(this.getArea() > a.getArea()){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Getters
	public Integer getA(){
		return this.a;
	}
	
	public Integer getB(){
		return this.b;
	}
	
	//Setters
	public void setA(Integer a){
		if(0 < a){
			this.a = a;
		}
	}
	
	public void setB(Integer b){
		if(0 < b){
			this.b = b;
		}
	}
}
