package info.jafe.toolkits;

import java.awt.Point;

public class Window {
public static Point getScreenSize(){
	Point screenSize = new Point(java.awt.Toolkit.getDefaultToolkit()
			.getScreenSize().width, java.awt.Toolkit.getDefaultToolkit()
			.getScreenSize().height);
	return screenSize;
}
}
