package mypackage2;

import java.awt.Color;
import mypackage.Colorable;

public class Pen extends Product{
	private Color color;
	private String brand;
	
	public Pen(String name, int price, int tax, Color color, String brand){
		super(name, price, tax);
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + this.color + " " + this.brand;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	
}
