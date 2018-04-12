package geometry;

public class Cuboid extends Prism{
	private double aSide;
	private double bSide;
	
	public Cuboid(int height, double aSide, double bSide){
		super(height);
		this.aSide = aSide;
		this.bSide = bSide;
	}
	
	public double getaSide() {
		return aSide;
	}
	public double getbSide() {
		return bSide;
	}
	public void setaSide(double aSide) {
		this.aSide = aSide;
	}
	public void setbSide(double bSide) {
		this.bSide = bSide;
	}
	
	@Override
	public double getBaseArea(){
		return this.aSide * this.bSide;
	}
	
	@Override
	public String toString(){
		return this.getHeight() + " " + this.aSide + " " + this.bSide;
	}
	
	
	
	
}
