package geometry;

public abstract class Prism {
	private int height;
	
	public Prism(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public abstract double getBaseArea();
	
	public double getVolume(){
		return this.getBaseArea() * this.height;
	}
	
	public boolean isBiggerVolume(Prism prism){
		return (this.getVolume() > prism.getVolume());
	}
	
	
}
