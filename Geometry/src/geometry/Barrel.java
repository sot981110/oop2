package geometry;

public class Barrel extends Prism{
	private double radius;
	
	public Barrel(int height, double radius){
		super(height);
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	@Override
	public double getBaseArea(){
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public String toString(){
		return this.getHeight() + " " + this.radius;
	}
	
	
}
