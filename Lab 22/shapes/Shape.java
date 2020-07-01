package shapes;
import java.awt.*;
import java.util.*;
/** Lab 22, COMP160, Nicholas Dong
  * Shape.java
  * Holds circle data to be created
  */

public class Shape{
  private int x, y, width, height;
  private Color colour;
  
  private int moveX = 1, moveY = 1;
  
  //random number generator
  public int randomRange(int lo, int hi){
    Random generator = new Random();
    return generator.nextInt(hi-lo+1) + lo;
  }
  
  /** Randomly generates values to initialise data fields
    */
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, 400-width);
    y = randomRange(0, 400-height);
    colour = new Color(randomRange(0, 255),randomRange(0, 255),randomRange(0, 255));
    if (y>200)
      moveY = -moveY;
  }
  
  /** draws circles at location (x,y) of size (width, height)
    */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
  
  /** moving circle locations
    */
  public void move(){
    //horizontal
    if(x<0)
      moveX = -moveX;
    if(x>(400-width))
      moveX = -moveX;
    //vertical
    if(y<0)
      moveY = -moveY;
    if(y>(400-height))
      moveY = -moveY;
    
    /** //size-based movement
      if (width < 15)
      x += moveX;
      else
      y += moveY;
      */
    
    x += moveX;
    y += moveY;
  }
  
  /** changing circle colour to a new randomly generated colour
    */
  public void change(){
    colour = new Color(randomRange(0, 255),randomRange(0, 255),randomRange(0, 255));
  }
}
