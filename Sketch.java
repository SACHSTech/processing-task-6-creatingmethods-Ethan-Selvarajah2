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
   * @param xLocation the x-location of the first point
   * @param yLocation the y-location of the first point
   * @param size the sizes of the square, triangle, and rectangle
   */
  void drawHouse(float xLocation, float yLocation, float size) {
    fill(191, 142, 52);
    square((float)(xLocation), (float)(yLocation), (float)(size));
    triangle((float)(xLocation), (float)(yLocation), (float)(xLocation + size / 2), (float)(yLocation - size / 2),
    (float)(xLocation + size), (float)(yLocation));
  
    fill(230, 175, 76);
    rect((float)(xLocation + size / 2), (float)(yLocation + size - size / 2), (float)(size / 4), (float)(size / 2));
  }

  /**
   * Draws a shocked face
   * @param xLocation the x-location of the center of the ellipse
   * @param yLocation the y-location of the center of the ellipse
   * @param size the size of the ellipse
   * @param colour1 the first RGB value
   * @param colour2 the second RGB value
   * @param colour3 the third RGB value
   */
  void drawFace(float xLocation, float yLocation, float size, int colour1, int colour2, int colour3){
    fill(colour1, colour2, colour3);
    ellipse(xLocation, yLocation, size, size);

    fill(0);
    ellipse(xLocation - size / 10, yLocation - size / 10, size / 10, size / 10);
    ellipse(xLocation + size / 10, yLocation - size / 10, size / 10, size / 10);

    ellipse(xLocation, yLocation + size / 5, size / 5, size / 5);
  }

  /**
   * Calculates the area of the face
   * @param size2 the size of the face
   * @return returns the area of the face
   */
  private float faceAreaCalc(float size2) {
    return (float)(Math.PI * Math.pow(size2, 2));
    
  }
  
  public void draw() {
    drawHouse(100, 150, 50);
    drawFace(200, 200, 150, 125, 240, 255);
    drawHouse(140, 30, 90);
    drawHouse(200, 300, 100);
  }
}