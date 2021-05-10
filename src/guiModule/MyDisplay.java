package guiModule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setUp ( ) {
		size(400, 400);
		background(200, 200, 0);
	}
	
	public void draw() {
		fill(255, 255, 0);
		// ellipse (x-coordinate, y-coordinate, ellipse_width, ellipse_height)
		ellipse(200, 200, 390, 390); // face is done
		
		fill(0,0,0);
		ellipse(120, 130, 50, 70); // left eye
		fill(0,0,0);
		ellipse(280, 130, 50, 70); // right eye
		
		// arc (x-coordinate, y-coordinate, arc_width, arc_height, angle_clockwise, angle_scale);
		arc(200, 200, 75, 75, 0, PI); // mouth
	//	noFill(); shape is not filled
	}
}
