package geometryArray;

import geometry.Prism;
import geometry.Barrel;
import geometry.Cuboid;

public class PrismArray {
	private Prism[] prismArray;
	
	public PrismArray(int max){
		this.prismArray = new Prism[max];
	}
	
	public void setIndexedPrism(int index, Prism prism){
		this.prismArray[index] = prism;
	}
	
	public int getArrayLength(){
		return this.prismArray.length;
	}
	
	public Prism getIndexedPrism(int index){
		return this.prismArray[index];
	}
	
	public int getNotNull(){
		int count = 0;
		for (int i = 0; i < prismArray.length; i++) {
			if(this.prismArray[i] != null){
				count++;
			}
		}
		return count;
	}
	
	public double getAverageVolume(){
		double average = 0;
		for (int i = 0; i < prismArray.length; i++) {
			if(this.prismArray != null){
				average += this.prismArray[i].getVolume();
			}
		}
		average = average / this.getNotNull();
		return average;
	}
	
	public int getBarrelCount(){
		int count = 0;
		for (int i = 0; i < prismArray.length; i++) {
			if(this.prismArray[i] instanceof Barrel){
				count++;
			}
		}
		return count;
	}
	
}
