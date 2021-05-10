package module1;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	
	private String URL = "http://processing.org/img/processing-web.png";
	private PImage backgroundImg;
	 
	public void setup() {
		size(200,200);
		background(255); // background color
		stroke(0); // pen color to black
		backgroundImg = loadImage(URL,"png");
		backgroundImg.resize(0, height);
		/* width is not given here, so that java by itself will display the image with
		 matching width. height is an in-build parameter of PApplet which gives the image height.
		 it is dynamic */
		image(backgroundImg, 0, 0);
	}
	
	public void draw() {
		int[] color = sunColorSec(second()); // calculate color code for the sun
		fill(color[0], color[1], color[2]); // set sun color depending upon the second
		// ellipse (x-coordinate, y-coordinate, ellipse_width, ellipse_height)
		ellipse(width/4, height/5, width/5, height/5); // draw sun
		
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		// scale the brightness of yello based on seconds
		// 30 seconds -> black	|	0 seconds -> yellow
		//
		float difference30 = Math.abs(30-seconds);
		float ratio = difference30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//
		return rgb;
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
