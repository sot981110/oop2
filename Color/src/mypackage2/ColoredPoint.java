package mypackage2;

import java.awt.Color;
import mypackage.Colorable;

public class ColoredPoint extends Point implements Colorable{
	Color color;
	
	public ColoredPoint(Color color){
		super(0, 0);
		this.color = color;
	}
	
	public ColoredPoint(Color color, int x, int y){
		super(x, y);
		this.color = color;
	}
	
	@Override
	public String toString(){
		return this.getColor() + " " + this.x + " " + this.y;
	}
	
	@Override
	public Color getColor(){
		return this.color;
	}
	
	@Override
	public void setColor(Color color){
		this.color = color;
	}
	
	
}
