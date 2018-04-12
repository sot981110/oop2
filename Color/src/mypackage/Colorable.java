package mypackage;

import java.awt.Color;

public interface Colorable {
	Color defaultColor = Color.RED;
	
	Color getColor();
	
	void setColor(Color color);
}
