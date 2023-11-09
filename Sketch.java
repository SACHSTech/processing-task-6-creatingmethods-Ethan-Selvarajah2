import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * @author: Ethan Selvarajah
   * Description: This program creates a method that allows for a house to be drawn anywhere, a face to be drawn anywhere
   * and it creates a method that returns the area of a face.
   */

  public void settings() {
	// Size call
    size(400, 400);
  }

   // Initial setup
  public void setup() {
    background(210, 255, 173);
    System.out.println("The area of the face is " + faceAreaCalc(150));
  }

  /**
   * Draws a house
   * @param fltXLocation the x-location of the first point
   * @param fltYLocation the y-location of the first point
   * @param fltSize the sizes of the square, triangle, and rectangle
   */
  void drawHouse(float fltXLocation, float fltYLocation, float fltSize) {
    fill(191, 142, 52);
    square((float)(fltXLocation), (float)(fltYLocation), (float)(fltSize));
    triangle((float)(fltXLocation), (float)(fltYLocation), (float)(fltXLocation + fltSize / 2), (float)(fltYLocation - fltSize / 2),
    (float)(fltXLocation + fltSize), (float)(fltYLocation));
  
    fill(230, 175, 76);
    rect((float)(fltXLocation + fltSize / 2), (float)(fltYLocation + fltSize - fltSize / 2), (float)(fltSize / 4), (float)(fltSize
    / 2));
  }

  /**
   * Draws a shocked face
   * @param fltXLocation the x-location of the center of the ellipse
   * @param fltYLocation the y-location of the center of the ellipse
   * @param fltSize the size of the ellipse
   * @param intColour1 the first RGB value
   * @param intColour2 the second RGB value
   * @param intColour3 the third RGB value
   */
  void drawFace(float fltXLocation, float fltYLocation, float fltSize, int intColour1, int intColour2, int intColour3){
    fill(intColour1, intColour2, intColour3);
    ellipse(fltXLocation, fltYLocation, fltSize, fltSize);

    fill(0);
    ellipse(fltXLocation - fltSize / 10, fltYLocation - fltSize / 10, fltSize / 10, fltSize / 10);
    ellipse(fltXLocation + fltSize / 10, fltYLocation - fltSize / 10, fltSize / 10, fltSize / 10);

    ellipse(fltXLocation, fltYLocation + fltSize / 5, fltSize / 5, fltSize / 5);
  }

  /**
   * Calculates the area of the face
   * @param fltSize2 the size of the face
   * @return returns the area of the face
   */
  private float faceAreaCalc(float fltSize2) {
    return (float)(Math.PI * Math.pow(fltSize2, 2));
    
  }
  
  public void draw() {
    drawHouse(100, 150, 50);
    drawFace(200, 200, 150, 125, 240, 255);
    drawHouse(140, 30, 90);
    drawHouse(200, 300, 100);
  }
}